public class EmpWage1 {
	 //initializing constants that is class variables
        public static final int is_Full_Time = 1;
        public static final int is_Part_Time = 2;
        public static final int wage_Per_Hr = 20;
        public static final int month_days = 20;
        public static final int max_Hrs = 100;

        public static void main (String[] args) {
        //initializing variables
        int days = 0;
        int total_Hrs = 0;
        int total_Wages = 0;
        int empHrs = 0;
        //loop through using while loop till condition is met
        while (total_Hrs != max_Hrs && days != month_days) {

                days ++;
                int empCheck =(int) Math.floor(Math.random() * 10) % 3;

        //use switch case to check if employee present, absent or part time present
                switch (empCheck) {
                        case is_Full_Time:
                                empHrs = 8;
                                        break;

                        case is_Part_Time:
                                empHrs = 4;
                                        break;

                        default:
                                empHrs = 0;
                                        break;

                }
                total_Hrs += empHrs;
                int empWage = (empHrs * wage_Per_Hr);
                total_Wages += empWage;
        }
        System.out.println("total salary " + total_Wages);

}
}

