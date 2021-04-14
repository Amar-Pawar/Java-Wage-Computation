public class EmpWage {
	public static void main (String[] args) {
	System.out.println("Welcome to Employee wage Computation program");
	//initializing variables
	int is_Full_Time = 1;
        int is_Part_Time = 2;
        int wage_Per_Hr = 20;
        int work_Hrs = 8;
        int part_Time_Hrs = 4;
        int wages = 0;
	//use random to generate random number 
        double empCheck = Math.floor(Math.random() * 10) % 3;
	//using if statement to check if employee is present or not and calculate wages
        if (empCheck == is_Full_Time){
                wages = (wage_Per_Hr * work_Hrs);
                System.out.println("Employee is present");
        }
        else if (empCheck == is_Part_Time){
                wages = (wage_Per_Hr * part_Time_Hrs);
                System.out.println("Employee is part time present");
        }
        else
                System.out.println("Employee is absent");
	
	System.out.println("wages of the employee are " + wages);
	}
}
