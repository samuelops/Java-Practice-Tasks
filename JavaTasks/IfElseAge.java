package mytasks;

import java.util.Scanner;

public class IfElseAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myobj = new Scanner(System.in);
		System.out.print("Enter your Age: ");
		int age = myobj.nextInt();
		myobj.nextLine();
		System.out.print("Enter your Nationality: ");
		String nationality = myobj.next().toLowerCase();
		if((age>18)&&(nationality.equals("indian"))) {
			System.out.println("Congratulaions, you're eligible to vote");
		}
			else {
				System.out.println("Sorry!, You're not eligible");
			}

	}

}
