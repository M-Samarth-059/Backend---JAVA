import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            arr.add(in.nextInt());
        }
        int q = in.nextInt();
        
        while(q>0){
            in.nextLine();
            String cmd = in.nextLine();
            int x = in.nextInt();
            if(cmd.equals("Insert")){
                int y = in.nextInt();
                arr.add(x,y);
            }
            else{
                arr.remove(x);
            }
            q -= 1;
        }
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
