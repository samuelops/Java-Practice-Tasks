package mytasks;
import java.util.Scanner;
public class SumOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myobj = new Scanner(System.in);
		System.out.print("Enter the First Number: ");
		int a = myobj.nextInt();
		System.out.print("Enter the Second Number: ");
		int b = myobj.nextInt();
		int n = b-a+1;
		int sum = n*(a+b)/2;
		System.out.println("The Sum of Numbers from " +a+ " to " +b+ " is " +sum);
	}

}

//Alternative Loop Approach
//package mytasks;
//import java.util.Scanner;
//public class SumOfNum {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner myobj = new Scanner(System.in);
//		System.out.print("Enter the First Number: ");
//		int a = myobj.nextInt();
//		System.out.print("Enter the Second Number: ");
//		int b = myobj.nextInt();
//		int sum=0;
//		for(int i=a;i<=b;i++) {
//			sum+=i;
//		}
//		System.out.println("The Sum of Numbers from " +a+ " to " +b+ " is " +sum);
//	}
//
//}
