package p1;
import java.util.*;
public class EvaluationOfPostfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.print("Enter postfix expression (single digit operands): ");
        String exp = sc.next();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (Character.isDigit(ch)) {
                stack.push(ch - '0');  
            }          
            else {
                int val2 = stack.pop();
                int val1 = stack.pop();
                int result = 0;
                switch (ch) {
                    case '+': result = val1 + val2; break;
                    case '-': result = val1 - val2; break;
                    case '*': result = val1 * val2; break;
                    case '/': result = val1 / val2; break;
                }
                stack.push(result);
            }
        }
        System.out.println("Result = " + stack.pop());
        sc.close();
    }
}