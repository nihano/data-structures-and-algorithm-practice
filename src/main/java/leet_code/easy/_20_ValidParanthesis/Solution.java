package leet_code.easy._20_ValidParanthesis;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new LinkedList<>();
        for(int i=0; i<s.length(); i++){
            Character ch = s.charAt(i);
            if(ch!='(' && ch!='[' && ch!='{' && ch!=')' && ch!=']' && ch!='}') continue;
            if(ch=='(' || ch=='[' || ch=='{'){
                stack.push(ch);
            }else{
                if(stack.isEmpty()) return false;
                switch(ch){
                case ')':
                    if(stack.pop()!='(') return false;
                    break;
                case ']':
                    if(stack.pop()!='[') return false;
                    break;
                case '}':
                    if(stack.pop()!='{') return false;
                    break;
                }
            }      
        }
        return stack.isEmpty();
        
    }
}