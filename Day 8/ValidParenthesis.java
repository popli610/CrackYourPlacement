import java.util.Stack;

public class ValidParenthesis {
    public boolean isValid(String s) {
        Stack st = new Stack();  
        for(int i =0; i< s.length(); i++){
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{')
            st.push(s.charAt(i));
            else if(s.charAt(i)==')'&& st.size()>0 && st.peek().equals('('))
            st.pop();
            else if(s.charAt(i)=='}'&& st.size()>0 && st.peek().equals('{'))
            st.pop();
            else if(s.charAt(i)==']'&& st.size()>0 && st.peek().equals('['))
            st.pop();
            else return false;
        }
        return st.isEmpty();
    }
}
