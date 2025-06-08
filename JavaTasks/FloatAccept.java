package mytasks;
import java.util.Scanner;
public class FloatAccept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the first Floating Number: ");
		float a = obj.nextFloat();
		System.out.print("Enter the second Floating Number: ");
		float b = obj.nextFloat();
		
		int conv1 = (int)(a*100); //Casting into int //Multiplied by 100 to shift up to two decimal places
		int conv2 = (int)(b*100); //Casting
		if(conv1 == conv2) {
			System.out.println("The Two Numbers are same up to 2 Decimal Points");
		}
		else {
			System.out.println("The Two Numbers are not same up to 2 Decimal Points");
		}
	}

}
