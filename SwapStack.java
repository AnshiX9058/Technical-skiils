package p1;
import java.util.*;
public class SwapStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            stack.push(sc.nextInt());
        }
        System.out.println("Original Stack: " + stack);       
        if (stack.size() >= 2) {
            int first = stack.pop();   
            int second = stack.pop();            
            stack.push(first);
            stack.push(second);
            System.out.println("Stack after swapping top two elements: " + stack);
        } else {
            System.out.println("Not enough elements to swap.");
        }
        sc.close();
    }
} 