public class EmpWage {
	public static void main (String[] args) {
	System.out.println("Welcome to Employee wage Computation program");
	//initializing variables
	int is_Full_Time = 1;
        int is_Part_Time = 2;
        int wage_Per_Hr = 20;
        int work_Hrs = 8;
        int part_Time_Hrs = 4;
        int month_days = 20;
        int days = 0;
        int work_day = 1;
        int max_Hrs = 0;
        int wages = 0;
	//using while for program to run until given condition is not reached
        while (max_Hrs != 100 && days != 20) {
        double empCheck = Math.floor(Math.random() * 10) % 3;
	//use if statements to check if emplyoyee present or not
        if (empCheck == is_Full_Time){
                wages = (wage_Per_Hr * work_Hrs);
                max_Hrs = (max_Hrs + work_Hrs);
                days = (days + work_day);
                System.out.println("Employee is present");
		//using nested if statement to break the loop if condition is reached
                if (max_Hrs == 100){
                break;
                }
                else if (days == 20){
                break;
                }
        }

	else if (empCheck == is_Part_Time){
                wages = (wage_Per_Hr * part_Time_Hrs);
                max_Hrs = (max_Hrs + part_Time_Hrs);
                days = (days + work_day);
                System.out.println("Employee is part time present");
		//using nested if statement to break the loop if condition is reached
                if (max_Hrs == 100){
                break;
                }
                else if (days == 20){
                break;
                }
        }
        else
                System.out.println("Employee is absent");
                days = (days + work_day);
                if (max_Hrs == 100){
                break;
                }
                else if (days == 20){
                break;
                }

        }
        int salary= (wage_Per_Hr * max_Hrs);
        System.out.println("total salary " + salary);
	}
}
