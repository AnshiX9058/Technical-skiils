package p1;
import java.util.*;
public class CountStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            stack.push(sc.nextInt());
        }
        int count = stack.size();
        System.out.println("Stack: " + stack);
        System.out.println("Number of elements in stack: " + count);
        sc.close();
    }
}
