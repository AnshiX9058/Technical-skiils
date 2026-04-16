package p1;
import java.util.Scanner;
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class InsertionLinkedList {
    public static Node insertAtBeginning(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }
    public static Node insertAtEnd(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null)
            return newNode;
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
        return head;
    }
    public static Node insertAtPosition(Node head, int data, int pos) {
        Node newNode = new Node(data);
        if (pos == 1) {
            newNode.next = head;
            return newNode;
        }
        Node temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++)
            temp = temp.next;
        if (temp == null) {
            System.out.println("Position not valid");
            return head;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }
    public static void traverse(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter data: ");
            int data = sc.nextInt();
            head = insertAtEnd(head, data);
        }
        System.out.println("\nOriginal List:");
        traverse(head);
        System.out.println("\n1.Insert Beginning  2.Insert End  3.Insert Position");
        int choice = sc.nextInt();
        System.out.print("Enter data to insert: ");
        int value = sc.nextInt();
        if (choice == 1)
            head = insertAtBeginning(head, value);
        else if (choice == 2)
            head = insertAtEnd(head, value);
        else {
            System.out.print("Enter position: ");
            int pos = sc.nextInt();
            head = insertAtPosition(head, value, pos);
        }
        
        
        
        System.out.println("\nUpdated List:");
        traverse(head);
    }
}