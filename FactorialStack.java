package p1;
import java.util.*;
public class FactorialStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();      
        System.out.print("Enter a number: ");
        int n = sc.nextInt();      
        for (int i = 1; i <= n; i++) {
            stack.push(i);
        }
        int factorial = 1;
        while (!stack.isEmpty()) {
            factorial = factorial * stack.pop();
        }
        System.out.println("Factorial of " + n + " is: " + factorial);
        sc.close();
    }
}