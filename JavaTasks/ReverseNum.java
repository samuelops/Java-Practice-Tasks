package mytasks;
import java.util.Scanner;
public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter a Number to Reverse: ");
		int num = obj.nextInt();
		int reversed = 0;
		while(num !=0) {
			int digit = num%10;
			reversed = reversed*10+digit;
			num /= 10;
		}
		System.out.println("Reversed Number: " +reversed);
	}

}
