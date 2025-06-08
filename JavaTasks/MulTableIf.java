package mytasks;
import java.util.Scanner;
public class MulTableIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myobj = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = myobj.nextInt();
		System.out.print("Enter the number of times: ");
		int times = myobj.nextInt();
		int res = num*times;
		if(times <=1 ) {
			System.out.println(+num+ " * " +times+ " = " +res);
		}
		if(times <=2 ) {
			System.out.println(+num+ " * " +times+ " = " +res);
		}
		if(times <=3 ) {
			System.out.println(+num+ " * " +times+ " = " +res);
		}
		if(times <=4 ) {
			System.out.println(+num+ " * " +times+ " = " +res);
		}
		if(times <=5 ) {
			System.out.println(+num+ " * " +times+ " = " +res);
		}
	}

}
