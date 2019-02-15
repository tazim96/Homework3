package hw; //enum

enum GradeLevel {
	FRESHMAN,
	SOPHMORE,
	JUNIOR,
	SENIOR
	}

	public class Rank { 
	  public static void main(String[] args) {
	    GradeLevel myVar = GradeLevel.SOPHMORE; 

	    switch(myVar) {
	      case FRESHMAN:
	        System.out.println("Freshman level");
	        break;
	      case SOPHMORE:
	         System.out.println("Sophmore level");
	        break;
	      case JUNIOR:
	        System.out.println("Junior level");
	        break;
	      case SENIOR:
		        System.out.println("Senior level");
		        break;
	    }
	  }
	}
