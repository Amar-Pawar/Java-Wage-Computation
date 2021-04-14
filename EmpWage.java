public class EmpWage {
	public static void main (String[] args) {
	System.out.println("Welcome to Employee wage Computation program");
	//initializing variables
	int is_Full_Time = 1;
        int wage_Per_Hr = 20;
        int work_Hrs = 8;
	//check if employee present or absent using random and calculating wages and printing
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == is_Full_Time){
                int wages = (wage_Per_Hr * work_Hrs);
                System.out.println("Employee is present");
                System.out.println("wages of the employee are " + wages);
        }
        else
                System.out.println("Employee is absent");

	}
}
