package empwage;

import java.util.Random;

public class EmpWage {

	public static void main(String[] args) {
	
		System.out.println("Welcome to Employee Wage.");
	
	 Random rand = new Random();

    int present = 1;
    int absent = 2;
    
    int check=rand.nextInt(3)+1;
    
    int wage_per_hr = 20;
    
    int full_day_hr = 8;

    int full_time_salary =0;

    if (check==present) {
        System.out.println("Employee is present.");
        full_time_salary = wage_per_hr * full_day_hr;
    }
    else {
        System.out.println("Employee is absent.");
    }
    	System.out.println("Daily employee wage: " + full_time_salary);
}
}
