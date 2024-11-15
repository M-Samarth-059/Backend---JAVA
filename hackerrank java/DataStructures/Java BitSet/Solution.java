import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        BitSet[] b={new BitSet(n),new BitSet(n)};
        for(int i=0;i<m;i++){
            String cmd = in.next();
            int x = in.nextInt();
            int y = in.nextInt();
            if(cmd.equals("AND")){
                b[x-1].and(b[y-1]);
            }else if(cmd.equals("OR")){
                b[x-1].or(b[y-1]);
            }else if(cmd.equals("XOR")){
                b[x-1].xor(b[y-1]);
            }else if(cmd.equals("FLIP")){
                b[x-1].flip(y);
            }else if(cmd.equals("SET")){
                b[x-1].set(y);
            }
            System.out.println(b[0].cardinality()+" "+b[1].cardinality());
        }
    }
}
