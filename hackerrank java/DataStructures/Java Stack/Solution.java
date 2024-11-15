import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            //Complete the code
            Stack<Character> st = new Stack<>();
            for (int i=0;i<input.length();i++) {
                if(st.isEmpty()){
                    st.push(input.charAt(i));
                }
                else if(st.peek() == '{' && input.charAt(i)=='}'){
                    st.pop();
                }
                else if(st.peek() == '[' && input.charAt(i)==']'){
                    st.pop();
                }
                else if(st.peek() == '(' && input.charAt(i)==')'){
                    st.pop();
                }
                else{
                    st.push(input.charAt(i));
                }
            }
            System.out.println((st.isEmpty())? "true":"false");
		}
		
	}
}



