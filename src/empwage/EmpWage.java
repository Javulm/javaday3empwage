package empwage;

import java.util.Random;

public class EmpWage {

	public static void main(String[] args) {
	
		System.out.println("Welcome to Employee Wage.");
	
	 Random rand = new Random();

     int present = 1;
     int absent = 2;
     int check=rand.nextInt(3)+1;

     if (check==present) {
         System.out.println("Employee is present.");
     }
     else {
         System.out.println("Employee is absent.");
     }
}
}
