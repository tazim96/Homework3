package hw; //Conditional

import java.util.Scanner;

public class Conditional {
	 
	 public static void main(String[] args) {
	 
		    
	 Scanner sc = new Scanner(System.in);
     System.out.println("Enter the # of credits you've completed so far: ");
     int credits = sc.nextInt();
	 int years;
     
	        if (credits >= 120) {
	            years = 0;
	        } else if (credits >= 90) {
	            years = 1;
	        } else if (credits >= 60) {
	            years = 2;
	        } else if (credits >= 30) {
	            years = 3;
	        } else {
	            years = 4;
	        }
	        System.out.println("Years left to graduate: " + years);
	 
	 }
	}