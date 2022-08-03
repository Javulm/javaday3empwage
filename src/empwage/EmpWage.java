package empwage;

import java.util.Random;

public class EmpWage {

	public static void main(String[] args) {
	
		System.out.println("Welcome to Employee Wage.");
	
		Random rand = new Random();

	   int present = 1;
	   int absent = 2;
	   int part_time_present = 3;
	   
	   int check=rand.nextInt(3)+1;
	   
	   int wage_per_hr = 20;
	   
	   int full_day_hr = 8;
	   
	   int part_time_hr = 4;

	   int full_time_salary = 0;
	   
	   int part_time_salary = 0;
	   
	   int max_working_days = 20;
	   int monthly_salary = 0;
	   int monthly_parttime_salary = 0;
	   


//	   if (check==present) {
//	       System.out.println("Employee is present.");
//	       full_time_salary = wage_per_hr * full_day_hr;
//	   }
//	   else if (check==part_time_present) {
//		   System.out.println("Employee is present for part time.");
//		   part_time_salary = wage_per_hr * part_time_hr;
//	   }
//	   else {
//	       System.out.println("Employee is absent.");
//	   }
//	   	System.out.println("Daily employee wage: " + full_time_salary);
//	   	System.out.println("Part time employee wage: " + part_time_salary);
	   	
	   	switch (check) {
	   	case 1:
	   		System.out.println("Employee is present.");
		    full_time_salary = wage_per_hr * full_day_hr;
		    monthly_salary =full_time_salary * max_working_days;
		    break;
	   	case 3:
	   		System.out.println("Employee is present for part time.");
			 part_time_salary = wage_per_hr * part_time_hr;
			 monthly_parttime_salary = part_time_salary * max_working_days;
			 break;
	   	default:
	   		System.out.println("Employee is absent.");
	   	}
	   	System.out.println("Daily employee wage: " + full_time_salary);
	   	System.out.println("Part time employee wage: " + part_time_salary);
	   	System.out.println("total one month (assumed 20 days) salary: " + monthly_salary);
	   	System.out.println("total one month (assumed 20 days) part time salary: " + monthly_parttime_salary);
}
}