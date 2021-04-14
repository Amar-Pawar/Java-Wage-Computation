public class EmpWage1 {
        public static void main (String[] args) {
       //initializing vaiables
	int is_Full_Time = 1;
        int is_Part_Time = 2;
        int wage_Per_Hr = 20;
        int work_Hrs = 8;
        int part_Time_Hrs = 4;
        int month_Days = 20;
        int wages = 0;
        int monthly_Wages = 0;
	//using random to generate random number
        double empCheck = Math.floor(Math.random() * 10) % 3;
	//converting double into integer for switch case
        int empcheck = (int) empCheck;
	//initializing a string for employee attendance status
        String status;
	//using switch case to check if employee present, absent or part time present based on random number generated
        switch (empcheck) {
        case 1:
                status = "employee is present";
		//calculating daily wages
                wages = (wage_Per_Hr * work_Hrs);
                break;
        case 2:
                status = "employee is part time present";
                wages = (wage_Per_Hr * part_Time_Hrs);
                break;
        default:
                status = "employee is absent";
                System.out.println(status);
                break;
        }
	//caculating monthly wages
	monthly_Wages = (month_Days * wages);
        System.out.println(status + " and daily wages are " + wages);
        System.out.println("monthly wages of employee " + monthly_Wages);
}
}

