import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<Integer>();
        int n = in.nextInt();
        int m = in.nextInt();
        int []a=new int[10000001];
        int i=0,r=0,c=0;
        for(;i<m;i++){
            int x=in.nextInt();
            if(a[x]==0){c++;if(r<c)r=c;}
            a[x]++;
            deque.addLast(x);
        }
        for(;i<n;i++){
            if(a[(int)deque.getFirst()]==1)c--;
            a[(int)deque.getFirst()]--;
            deque.removeFirst();
            int x=in.nextInt();
            if(a[x]==0){c++;if(r<c)r=c;}
            a[x]++;
            deque.addLast(x);
        }
        System.out.println(r);
    }
}



