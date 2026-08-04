package stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class MakeTheStringGreat {
    public String makeGood(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(char ch : s.toCharArray()){
            if(!stack.isEmpty()){
                if(Math.abs(stack.peek() - ch) == 32){
                    stack.pop();
                }
                else{
                    stack.push(ch);
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
