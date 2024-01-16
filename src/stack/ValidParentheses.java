package stack;

import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {

        //Instantiate a new stack to push and pop the parentheses
        Stack<Character> myStack = new Stack<>();

        //loop through the string for each char
        for(char ch : s.toCharArray()){
            //if it's an opening parentheses
            if(ch == '(' || ch == '{' || ch == '['){
                myStack.push(ch);
            }

            //if closing parentheses, check if it is preceded by correct parentheses
            else if(ch == ')' && !myStack.isEmpty() && myStack.peek() == '('){
                myStack.pop();
            }
            else if(ch == '}' && !myStack.isEmpty() && myStack.peek() == '{'){
                myStack.pop();
            }
            else if(ch == ']' && !myStack.isEmpty() && myStack.peek() == '['){
                myStack.pop();
            }

            //if none of these conditions are met
            else return false;
        }

        //if stack is empty, then it should be a valid parentheses
        return myStack.isEmpty();
    }
}
