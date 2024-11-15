import java.security.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws NoSuchAlgorithmException  {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String message = scan.next();
        scan.close();
        
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(message.getBytes());
        byte[] digest = md.digest();
        
        for (byte b : digest) {
            System.out.format("%02x", b);
        }
    }
}
