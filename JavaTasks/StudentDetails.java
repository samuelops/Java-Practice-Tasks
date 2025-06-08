package mytasks;

import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myobj = new Scanner(System.in);
		
		System.out.println("Enter the roll no: ");
		int rollno = myobj.nextInt();
		myobj.nextLine();
		System.out.println("Enter the name of the Student: ");
		String name = myobj.nextLine();
		System.out.println("Enter marks for Subject 1: ");
		double s1 = myobj.nextDouble();
		System.out.println("Enter marks for Subject 2: ");
		double s2 = myobj.nextDouble();
		System.out.println("Enter marks for Subject 3: ");
		double s3 = myobj.nextDouble();
		System.out.println("Enter marks for Subject 4: ");
		double s4 = myobj.nextDouble();
		System.out.println("Enter marks for Subject 5: ");
		double s5 = myobj.nextDouble();
		double average = (s1+s2+s3+s4+s5)/5.0;
		System.out.println("Student Roll No: " +rollno);
		System.out.println("Student Name: " +name);
		System.out.println("Maths: " +s1);
		System.out.println("Science: " +s2);
		System.out.println("Social Science: " +s3);
		System.out.println("Tamil: " +s4);
		System.out.println("English: " +s5);
		System.out.println("Average of all 5 subjects: " + average);
	}

}
