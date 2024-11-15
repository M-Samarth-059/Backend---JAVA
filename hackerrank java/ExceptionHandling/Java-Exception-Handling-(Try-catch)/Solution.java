import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        try{
            int a = in.nextInt();
            int b = in.nextInt();
            int c = a/b;
            System.out.println(c);
        }
        catch(InputMismatchException ie){
            System.out.println(ie.getClass().getName());
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
