import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length()!=b.length()){
            return false;
        }
        else{
            int[] arr = new int[26];
            a = a.toLowerCase();
            b = b.toLowerCase();
            for(int i=0;i<a.length();i++){
                arr[a.charAt(i)-'a'] += 1;
                arr[b.charAt(i)-'a'] -= 1;
            }
            for (int i : arr) {
                if (i!=0){
                    return false;
                }
            }
            return true;
        }
        
    }
}