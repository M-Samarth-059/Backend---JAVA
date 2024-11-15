import java.math.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BigInteger a,b,add,mul;
        Scanner scan = new Scanner(System.in);
        a = new BigInteger(scan.nextLine());
        b = new BigInteger(scan.nextLine());
        add = a.add(b);
        mul = a.multiply(b);
        System.out.println(add);
        System.out.println(mul);
    }
}
