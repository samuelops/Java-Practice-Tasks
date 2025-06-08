package mytasks;
import java.util.Scanner;
public class MultTableWhle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myobj = new Scanner(System.in);
		System.out.print("Enter a number to print Multiplication Table: ");
		int num = myobj.nextInt();
		System.out.print("Enter the times you want to print the table: ");
		int times = myobj.nextInt();
		int i=1;
		while(i<=times) {
			System.out.println(+num+ " * " +i+ " = " +(num*i));
			i++;
		}
	}

}
