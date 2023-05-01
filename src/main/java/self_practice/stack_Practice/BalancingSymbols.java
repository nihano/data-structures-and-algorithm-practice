package self_practice.stack_Practice;

public class BalancingSymbols {
    public static void main(String[] args) {
        String exp = ")((A+B))-((C*D))/{[F*(B/2)]}";
        System.out.println(checkBalance(exp));
    }

    public static boolean checkBalance(String exp) {
        MyStack<Character> myStack = new MyStack<>();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
                if (!myStack.isEmpty()) {
                    if (myStack.peek() == '(' && ch == ')') {
                        myStack.pop();
                    } else if (myStack.peek() == '{' && ch == '}') {
                        myStack.pop();
                    } else if (myStack.peek() == '[' && ch == ']') {
                        myStack.pop();
                    }
                }else if (myStack.isEmpty() &&  ch == ')' || ch == '}' || ch == ']'){
                    return false;
                }

                if (ch == '(' || ch == '{' || ch == '[') myStack.push(ch);

        }
        return myStack.isEmpty();
    }
}

