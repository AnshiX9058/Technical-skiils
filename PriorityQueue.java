package p1;

// Perform Priority Queue

import java.util.*;

public class PriorityQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] priority = new int[n];

        int[] result = new int[n];

        for (int i = 0; i <n; i++) {
            System.out.println("Enter Array Element " + i + " :");
            arr[i] = sc.nextInt();
        }
        
        for (int i = 0; i <n; i++) {
            System.out.println("Enter Priority of Element " + i + " :");
            priority[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            result[priority[i]-1] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.println(result[i]);
        }
    }
}