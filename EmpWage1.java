public class EmpWage1 {
         //initializing constants that is class variables
        public static final int is_Full_Time = 1;
        public static final int is_Part_Time = 2;
        private final String company;
        private final int wage_Per_Hr;
        private final int month_days;
        private final int max_Hrs;
        private int totalEmpWage;

        //creating a class method
        public EmpWage1(String company, int wage_Per_Hr, int month_days, int max_Hrs) {

                this.company = company;
                this.wage_Per_Hr = wage_Per_Hr;
                this.month_days = month_days;
                this.max_Hrs = max_Hrs;
        }
        public void computeWage(){
                //initializing variables
                int days = 0;
                int total_Hrs = 0;
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
                        System.out.println("Day#: " + days + " emp hrs: " +empHrs);
                }
                totalEmpWage = total_Hrs * wage_Per_Hr;
        }

        //@override
        public String toString() {
                return "total emp wage for company: " + company + " is: " + totalEmpWage;

        }
        public static void main(String[] args) {
                EmpWage1 DMart = new EmpWage1("DMart",20,20,100);
                EmpWage1 Relience = new EmpWage1("Relience",30,25,80);
                DMart.computeWage();
                System.out.println(DMart);
                Relience.computeWage();
                System.out.println(Relience);
        }

}

