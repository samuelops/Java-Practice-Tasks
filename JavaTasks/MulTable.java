package mytasks;
import java.util.Scanner;
public class MulTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner myobj = new Scanner(System.in);
	System.out.print("Enter a number to print multiplication table: ");
	int num = myobj.nextInt();
	System.out.print("Enter how many times you want to print the table: ");
	int times = myobj.nextInt();
	for(int i=1;i<=times;i++) {
		int res = num*i;
		System.out.println(+num+ " * " +i+ " = " +res);
	}

	}

}


//package mytasks;
//import java.util.Scanner;
//public class MulTable {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner myobj = new Scanner(System.in);
//		System.out.print("Enter a number to print multiplication table: ");
//		int num = myobj.nextInt();
//		System.out.print("Enter how many times you want to print the table: ");
//		int times = myobj.nextInt();
//		for(int i=1;i<=times;i++) {
//			int res = num*i;
//			System.out.println(+num+ " * " +i+ " = " +res);
//		}
//
//	}
//
//}
