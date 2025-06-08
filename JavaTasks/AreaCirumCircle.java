package mytasks;
import java.util.Scanner;
public class AreaCirumCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myobj = new Scanner(System.in);
		System.out.println("Enter the radius of the circle: ");
		double r = myobj.nextDouble();
		double pi = 3.14; //Math.PI Inbuilt Value
		double area = pi*r*r;
		double circum = 2*pi*r;
		System.out.println("The area of the circle is: " + area);
		System.out.println("The Circumference of the circle is: "+ circum);
	}
}
