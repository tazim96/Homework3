package hw;

import java.util.Scanner;

public class Student {
	private String first; //First name of the student
	private String last;  //Last name of the student
	private int id;//3 digit id of the student
	private String dob;   //Date of birth of the student
	private int credits; //Number of credits completed so far. Have to complete 120 credits to graduate
	private String email; //Students email address
	
	public Student() {}
	
	public Student(String first, String last, int id, String dob, int credits, String email) {
		this.first = first;
		this.last = last;
		this.id = id;
		this.dob = dob;
		this.credits = credits;
		this.email = email;
	}
	
	
//Getters and Setters
	public String getfirst() {
		return first;
	}
	
	public void setfirst(String first) {
		this.first = first;
	}
	
	public String getlast() {
		return last;
	}
	
	public void setlast(String last) {
		this.last = last;
	}
	
	public int getid() {
		return id;
	}
	
	public void setid(int id) {
		this.id = id;
	}
	
	public String getdob() {
		return dob;
	}
	
	public void setdob(String dob) {
		this.dob = dob;
	}
	
	public int getcredits() {
		return credits;
	}
	
	public void setcredits(int credits) {
		this.credits = credits;
	}
	
	public String getemail() {
		return email;
	}
	
	public void setemail(String email) {
		this.email = email;
	}
	
	
	
	
	public static void name(String first, String last) {
		String Studentfullname = first + last;
		System.out.println(Studentfullname);
	}
	
	public static void labpw(String last, String dob) {
		String Studentpassword = last + dob;
		System.out.println(Studentpassword);
	}
	
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		System.out.println("Please enter the number of students in the school: ");
		n  = in.nextInt();
		
		Student[] students = new Student[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Enter student's first name: ");
			String first = in.next();
			System.out.print("Enter student's last name: ");
			String last = in.next();
			System.out.print("Enter the student ID (3 digits): ");
			int id = in.nextInt();
			System.out.print("Enter date of birth of the student (MM/DD/YY): ");
			String dob = in.next(); 
			System.out.print("Enter Credits Completed: ");
			int credits = in.nextInt();
			System.out.print("Enter student's email address: ");
			String email = in.next();
	        students[i] = new Student(first, last, id, dob, credits, email);
	        
		}
		
		for (int i = 0; i < n; i++) {
			 int s = i+1;
			 System.out.println("Student#:" + s);
		     System.out.print("First Name: " + students[i].first + ", ");
		     System.out.print("Last Name: " + students[i].last + ", ");
		     System.out.print("Student ID: " + students[i].id +", ");
		     System.out.print("Date of Birth: " + students[i].dob +", ");
		     System.out.print("Credits Completed: " + students[i].credits +", ");
		     System.out.println("Emaill: " + students[i].email);
		     
			
		}
		}


}