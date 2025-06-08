package mytasks;
import java.util.Scanner;
public class PrintNaturalNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myobj = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = myobj.nextInt();
		System.out.println("The First " +num+ " Natural Numbers are as below");
		for(int i=1; i<=num; i++) {
		System.out.print(i + " ");
		}
		myobj.close();
	}
}
