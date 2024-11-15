import java.util.Date;
import java.util.Objects;

class Employee {
    private String id;
    private String name;
    private int age;
    private Date dateOfJoining;

    public Employee(String id, String name, int age, Date dateOfJoining) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dateOfJoining = dateOfJoining;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public String toString(){
        return "Employee{" +
                "id= " + id +
                ", name= " + name +
                ", age= " + age +
                ", dateOfJoining= " + dateOfJoining +
                '}';
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return id.equals(employee.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

public class Employeemain {
    public static void main(String[] args) {
        genericMyList<Employee> employeeList = new genericMyList<>();

        employeeList.add(new Employee("01", "Sam", 22, new Date(2024, 11, 10)));
        employeeList.add(new Employee("02", "Samarth", 23, new Date(2025, 1, 5)));
        employeeList.add(new Employee("03", "msamarth", 24, new Date(2025, 1, 16)));
        employeeList.add(new Employee("04", "msamarth", 24, new Date(2025, 1, 16)));

        for (int i = 0; i < employeeList.length; i++) {
            System.out.println(employeeList.get(i));
        }

        employeeList.deleteByIndex(0);

        employeeList.deleteByValue(new Employee("04", "msamarth", 24, new Date(2025, 1, 16)));

        for (int i = 0; i < employeeList.length; i++) {
            System.out.println(employeeList.get(i));
        }
    }
}