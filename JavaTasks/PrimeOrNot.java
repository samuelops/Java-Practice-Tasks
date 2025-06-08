package mytasks;
import java.util.Scanner;
public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myobj = new Scanner(System.in);
		System.out.println("--To Check Whether the Given Number is a Prime or Not--");
		System.out.print("Enter a Number : ");
		int num = myobj.nextInt();
		if(num<=1) {
			System.out.println("The Given Number is Not a Prime");
		}
		else{
			for(int i=2; i<num; i++) {
				if(num%i == 0) {
					System.out.println("The Given Number is Not a Prime");
					return;
				}
			}
			System.out.println("The Given Number is a Prime");
		}
		
		myobj.close();
	}

}
