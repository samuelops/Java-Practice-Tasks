package mytasks;
import java.util.Scanner;
public class PrintEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myobj = new Scanner(System.in);
		System.out.print("Enter the First Number: ");
		int a = myobj.nextInt();
		System.out.print("Enter the Second Number: ");
		int b = myobj.nextInt();
		System.out.println("Even Numbers");
		for(int i=a;i<=b;i++) {
			if(i%2==0) {
				System.out.print(i + " ");
			}
			
		}
			System.out.println("\nOdd Numbers");
			for(int i=a;i<=b;i++) {
				if(i%2 != 0) {
				System.out.print(i + " ");
			}
		}
			myobj.close();

	}

}
