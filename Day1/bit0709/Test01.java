import java.util.*;

/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/9 9:15
 */
public class Test01 {
    public boolean IsPopOrder(int[] pushA, int[] popA) {
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        for (int i = 0; i < pushA.length; i++) {
            stack.push(pushA[i]);
            while (j < popA.length && !stack.isEmpty() && stack.peek() == popA[j]) {
                stack.pop();
            }
        }
        return stack.empty();


    }

}

/*class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<Character>();
        for(char c:s.toCharArray()){
            if(c=='(')stack.push(')');
            else if(c=='{')stack.push('}');
            else if(c=='[')stack.push(']');
            else if(stack.isEmpty() || c!=stack.pop())return false;
        }
        return stack.isEmpty();
    }
}*/

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(String x:tokens){
            if(!isOperation(x)){
                stack.push(Integer.parseInt(x));
            }else{
                int num2=stack.pop();
                int num1=stack.pop();
                switch (x){
                    case "+":stack.push(num1+num2);break;
                    case "/":stack.push(num1/num2);break;
                    case "*":stack.push(num1*num2);break;
                    case "-":stack.push(num1-num2);break;
                }

            }
        }
        return stack.pop();
    }
    private boolean isOperation(String s){
        if(s.equals("+") || s.equals("/") || s.equals("-") || s.equals("*") ){
            return true;
        }
        return false;
    }
}

