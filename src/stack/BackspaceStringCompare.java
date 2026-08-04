package stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BackspaceStringCompare {
    public boolean backspaceCompare(String s, String t) {
        String first = process(s);
        String second = process(t);
        return first.equals(second);

    }
    public String process(String str){
        Deque<Character> stack = new ArrayDeque<>();
        for(char ch : str.toCharArray()){
            if(ch == '#'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else{
                stack.push(ch);
            }

        }
        StringBuilder ans = new StringBuilder();
        while(!stack.isEmpty()){
            ans.append(stack.pop());
        }
        return ans.reverse().toString();
    }
}
