

public class Solution {
public static String getSmallestAndLargest(String s, int k) {
    String smallest = "";
    String largest = "";
    
    // Complete the function
    // 'smallest' must be the lexicographically smallest substring of length 'k'
    // 'largest' must be the lexicographically largest substring of length 'k'
    String temp="";
    for (int i=0;i<=s.length()-k;i++){
        temp = s.substring(i,i+k);
        if(temp.compareTo(smallest)<0 || smallest==""){
            smallest = temp;
        }
        if (temp.compareTo(largest)>0){
            largest = temp;
        }
    }
    return smallest + "\n" + largest;
}
}

