package hw; //Encapsulation


public class TestStudent {
	public static void main(String[] args) {
		Student myStudent = new Student();

		myStudent.setfirst("Steph");
		myStudent.setlast("Curry");
		myStudent.setid(312);
		myStudent.setdob("03/17/88");
		myStudent.setcredits(46);
		myStudent.setemail("S.Curry@gmail.com");

		System.out.println("First Name: " + myStudent.getfirst());
		System.out.println("Last Name: " + myStudent.getlast());
		System.out.println("Student ID: " + myStudent.getid());
		System.out.println("Date of Birth: " + myStudent.getdob());
		System.out.println("Credits Completed: " + myStudent.getcredits());
		System.out.println("Email Address: " + myStudent.getemail());
	}
}