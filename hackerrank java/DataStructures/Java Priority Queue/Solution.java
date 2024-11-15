import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Comparator;
/*
 * Create the Student and Priorities classes here.
 */
 class Student{
     private int id;
     private String name;
     private double cgpa;
     
     public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    
     int getID(){
         return id;
     }
     String getName(){
         return name;
     }
     double getCGPA(){
         return cgpa;
     }
 }

class Priorities{
    
    private static final Comparator<Student> COMPARATOR = new Comparator<Student>() {
        @Override
        public int compare(Student s1, Student s2) {
            int res = Double.compare(s2.getCGPA(), s1.getCGPA());
            res = res == 0 ? s1.getName().compareTo(s2.getName()) : res;
            return res == 0 ? Integer.compare(s1.getID(), s2.getID()) : res;
        }
    };
                    
    List<Student> getStudents(List<String> events){
        PriorityQueue<Student> pq = new PriorityQueue<>(events.size(), COMPARATOR);
        List<Student> ans = new ArrayList<>();
        for (String event : events) {
            if(event.equals("SERVED")){
                if (!pq.isEmpty())
                    pq.remove();
            }
            else {
                String[] info = event.split(" ");

                pq.add(new Student(Integer.parseInt(info[3]), info[1], Double.parseDouble(info[2])));
            }
        }
        while (!pq.isEmpty()) {
            ans.add(pq.remove());
        }
        return ans;
    }
}

public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}