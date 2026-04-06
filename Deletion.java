package p1;
import java.util.*;
public class Deletion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for(int i=0;i<a.length;i++){
            System.out.print("\n enter element:");
            a[i] = sc.nextInt();
        }
        System.out.print("\n enter position:");
        int pos = sc.nextInt();
        for(int i=pos-1;i<a.length-1;i++){
            a[i]=a[i+1];
        }
        for(int i=0; i<a.length-1;i++){
            System.out.print("\n"+a[i]);
        }
	}

}
