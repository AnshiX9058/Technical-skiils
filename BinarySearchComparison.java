package p1;
import java.util.Scanner;
public class BinarySearchComparison {
    public static void main(String[] args) {
        int[] arr = {12};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter key to search: ");
        int key = sc.nextInt();
        int low = 0, high = arr.length - 1;
        int com = 0;
        int mid;
        boolean found = false;
        while (low <= high) {
            mid = (low + high) / 2;
            com++;
            if (arr[mid] == key) {
                System.out.println("Key found at index: " + mid);
                found = true;
                break;
            } else if (key > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (!found) {
            System.out.println("Key not found");
        }
        System.out.println("Number of comparisons: " + com);
        sc.close();
    }
}
