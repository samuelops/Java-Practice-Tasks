package mytasks;
import java.util.Scanner;
public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = obj.nextInt();
		
		if(num%2 == 0) {
			System.out.println("The Entered Number is Even.");
		}
		//(%2 !== 0) can be used or else
		else{
			System.out.println("The Entered Number is Odd");
		}
		obj.close();
	}

}
