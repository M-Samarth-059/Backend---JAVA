import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int lineno=1;
        while (scan.hasNext()){
            String s = scan.nextLine();
            System.out.println(lineno+" "+s);
            lineno += 1;
        }
    }
}
