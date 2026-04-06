package p1;
import java.util.Scanner;
public class PushPop {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int st[]=new int[5];
		int top=-1;
		int size=st.length-1;
		
		while(true){
			System.out.print("\n Enter your Choice : ");
			System.out.print("\n 1. Push Operation");
			System.out.print("\n 2. Pop Operation");
			System.out.print("\n 0. No Operation");
			System.out.println();
			int choice=sc.nextInt();
			int num;
		if(choice==1) {
			System.out.println("\n Enter number you want to insert");
			num=sc.nextInt();
			if (top==size) {
				System.out.print("\n Can't insert");
			}else {
				top++;
				st[top]=num;
				System.out.print("\n Number is inserted Successfully");
				System.out.print("\n Stack elements are: ");
				for(int i=top;i>=0;i--)
					System.out.print("\n "+st[i]);
			}
		}
		if (choice==2) {
			if (top==-1) {
				System.out.print("\n Can't delete");
			}else {
				top--;
				System.out.print("\n Number is deleted Successfully");
				System.out.print("\n Stack elements are: ");
				for(int i=top;i>=0;i--)
					System.out.print("\n "+st[i]);
				
			}
		}
		if(choice==0) {
			System.out.print("\n Stack elements are: ");
			for(int i=top;i>=0;i--)
				System.out.print("\n "+st[i]);
			break;
		}
																								}
	}

}