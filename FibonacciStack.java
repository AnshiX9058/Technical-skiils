package p1;
import java.util.*;
public class FibonacciStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();       
        int a = 0, b = 1;
        if (n >= 1) stack.push(a);
        if (n >= 2) stack.push(b);       
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            stack.push(c);
            a = b;
            b = c;
        }      
        System.out.println("Fibonacci series in stack: " + stack);
        sc.close();
    }
}