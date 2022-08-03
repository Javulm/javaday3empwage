package empwage;
import java.util.Random;
public class EmpWage {
public static void main(String[] args) {
	System.out.println("Welcome to Employee Wage.");
	
	Random rand = new Random();

   int present = 1;
   int part_time_present = 2;
   int absent = 3;
   
   int check=rand.nextInt(3)+1;
   
   int emphr = 0;
   int salary;
   int wage_per_hr = 20;
   
   int full_day_hr = 8;
   
   int part_time_hr = 4;

   int full_time_salary = 0;
   
   int part_time_salary = 0;
   
   int monthly_salary = 0;
   
   int monthly_parttime_salary = 0;
   
   int max_working_days = 20;
   
   int max_working_hrs = 100;
   
   int working_hrs=0;
   
   int working_days=0;


//   if (check==present) {
//       System.out.println("Employee is present.");
//       full_time_salary = wage_per_hr * full_day_hr;
//   }
//   else if (check==part_time_present) {
//	   System.out.println("Employee is present for part time.");
//	   part_time_salary = wage_per_hr * part_time_hr;
//   }
//   else {
//       System.out.println("Employee is absent.");
//   }
//   	System.out.println("Daily employee wage: " + full_time_salary);
//   	System.out.println("Part time employee wage: " + part_time_salary);
   while (working_hrs < max_working_hrs && working_days < max_working_days) {
   
	   switch (check) {
	case 1:
   		System.out.println("Employee is present.");
   		emphr=8;
//	    full_time_salary = wage_per_hr * full_day_hr;
//	    monthly_salary =full_time_salary * max_working_days;
	    break;
   	case 2:
   		System.out.println("Employee is present for part time.");
   		emphr=4;
//		 part_time_salary = wage_per_hr * part_time_hr;
//		 monthly_parttime_salary = part_time_salary * max_working_days;
		 break;
   	case 3:
   		System.out.println("Employee is absent.");
   		emphr=0;
   		}
//   	System.out.println("Daily employee wage: " + full_time_salary);
//   	System.out.println("Part time employee wage: " + part_time_salary);
//   	System.out.println("total one month (assumed 20 days) salary: " + monthly_salary);
//   	System.out.println("total one month (assumed 20 days) part time salary: " + monthly_parttime_salary);
    
	   int this_day = emphr*wage_per_hr;
    
	   	System.out.println(this_day);
    
	   	working_hrs = working_hrs + emphr;
    
	   	working_days = working_days + 1;
   		}
   		salary = working_hrs * wage_per_hr;
   
   		System.out.println("salary of month is : " + salary);
	}
}
