class companyWages {
        //initializing class variables
        public static final int is_Full_Time=1;
        public static final int is_Part_Time=2;

        private final String company;
        private final int month_days;
        private final int max_Hrs;
        private final int wage_Per_Hr;
        private int totalEmpWage;

        public companyWages (String company, int wage_Per_Hr, int month_days, int max_Hrs) {
        this.company = company;
        this.wage_Per_Hr = wage_Per_Hr;
        this.month_days = month_days;
        this. max_Hrs = max_Hrs;
        }

        public void computeEmpWage() {
        //initializing variables
        int empHrs=0;
        int total_Hr=0;
        int days=0;
        while (total_Hr != max_Hrs && days < month_days) {
                days++;
                int empCheck=(int)Math.floor(Math.random()*10) % 3;
                switch (empCheck) {
                        case is_Full_Time:
                                empHrs=8;
                                break;
                        case is_Part_Time:
                                empHrs=4;
                                break;
                        default:
                                empHrs=0;
                                break;
              }
	         total_Hr += empHrs;
        	  System.out.println("Day: "+days+ "Emp Hr:"+empHrs);
 	 }
     	  totalEmpWage= total_Hr * wage_Per_Hr;
	}

	@Override
  	public String toString() {
  	return "Total Emp Wage for company: "+company+"is:"+totalEmpWage;
  	}
}
public class EmpWage1 {
public static void main(String[] args) {

        companyWages DMart=new companyWages("DMart", 20, 20, 100 );
        DMart.computeEmpWage();
        System.out.println(DMart);

        companyWages JioMart=new companyWages("JioMart", 30, 25, 80 );
        JioMart.computeEmpWage();
        System.out.println(JioMart);
 }
}

