package hw; //Inheritance

import java.util.Scanner;

public class ComputerLab extends Student{
		public static void main(String[] args) {
		Student sample = new Student();	
		Scanner in = new Scanner(System.in);
		System.out.println("Enter First Name: ");
		String tempfirst = in.next();
		String first = tempfirst;
		System.out.println("Enter Last Name: ");
		String templast = in.next();
		String last = templast;
		System.out.println("Enter Date of Birth: ");
		String tempdob = in.next();
		String dob= tempdob;
		System.out.println("Your College Login ID is: ");
		name (first, last);
		System.out.println("Your College Login Password is: ");
		labpw (last, dob);
	    
	    }

		
		
	}