package p1;
import java.util.*;
public class MaxMinStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();    
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            stack.push(sc.nextInt());
        }
        System.out.println("Stack: " + stack);
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            int max = stack.peek();
            int min = stack.peek();
            for (int num : stack) {
                if (num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }
            }
            System.out.println("Maximum element: " + max);
            System.out.println("Minimum element: " + min);
        }
        sc.close();
    }
}