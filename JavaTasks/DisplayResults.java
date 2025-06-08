package mytasks;
import java.util.Scanner;
public class DisplayResults {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myobj = new Scanner(System.in);
		
		System.out.println("Enter the First Number: ");
		int a = myobj.nextInt();
		System.out.println("Enter the Second Number: ");
		int b = myobj.nextInt();
		int sum = a+b;
		int sub = a-b;
		int mul = a*b;
		int div = a/b;
		int rem = a%b;
		System.out.println("Sum: " +sum);
		System.out.println("Difference: "+ sub);
		System.out.println("Product:" +mul);
		System.out.println("Division: "+div);
		System.out.println("Remainder: "+rem);
	}
}
