import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan =  new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        int[][] arrM = new int[n][n];
        int count = 0;
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
            if(arr[i] < 0) count++;
            arrM[i][i] = arr[i];
            for(int j=0;j<i;j++){
                arrM[j][i] = arrM[j][i-1]+arr[i];
                if(arrM[j][i] < 0) count++;
            }
        }
        System.out.println(count);
        
    }
}
