import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder sb = new StringBuilder();
        sb.append(A);
        sb.reverse();
        String reversed = sb.toString();
        if(reversed.equals(A)){
            System.out.println("Yes");
        }        
        else{
            System.out.println("No");
        }
    }
}



