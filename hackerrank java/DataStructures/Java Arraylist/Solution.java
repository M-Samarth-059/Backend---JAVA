import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> nums = new ArrayList<ArrayList<Integer>>(n);
        for(int i=0;i<n;i++){
            ArrayList<Integer> list = new ArrayList<Integer>();
            int d = sc.nextInt();
            while(d>0){
                list.add(sc.nextInt());
                d -= 1;
            }
            nums.add(list);
        }
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            try{
                int x = sc.nextInt();
                int y = sc.nextInt();
                System.out.println(nums.get(x-1).get(y-1));
            }
            catch(Exception e){
                System.out.println("ERROR!");
            }
        }
    }
}
