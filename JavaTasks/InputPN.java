package mytasks;
import java.util.Scanner;
public class InputPN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myobj = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = myobj.nextInt();
		
		if(num>0) {
			System.out.println("The Entered Number is Positive");
		}
		else if(num<0) {
			System.out.println("The Entered Number is Negative");
		}
		else {
			System.out.println("The Entered Number is Zero(neither positive nor negative)");
		}
		myobj.close();
	}

}
