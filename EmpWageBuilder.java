public class EmpWageBuilder {
   public static final int IS_PART_TIME =1;
   public static final int IS_FULL_TIME =2;

   private final String company;
   private final int empRatePerHour;
   private final int numOfWorkingDays;
   private final int maxHourPerMonth;
   private int totalEmpWage;

   public EmpWageBuilder(String company, int empRatePerHour,
                           int numOfWorkingDays, int maxHourPerMonth){
      this.company = company;
      this.empRatePerHour = empRatePerHour;
      this.numOfWorkingDays = numOfWorkingDays;
      this.maxHourPerMonth = maxHourPerMonth;
   }
   public void computeEmpWage(){
      int empHrs =0, totalEmpHrs =0, totalworkingDays =0;
      while (totalEmpHrs <= maxHourPerMonth &&
               totalworkingDays < numOfWorkingDays){
               totalworkingDays++;
      int empCheck = (int)Math.floor(Math.random() *10) % 3;
      switch (empCheck){
         case IS_PART_TIME:
            empHrs = 4;
            break;

         case IS_FULL_TIME:
            empHrs = 8;
            break;

         default:
            empHrs = 0;
      }

      totalEmpHrs += empHrs;
      System.out.println("Day#: " + totalworkingDays + "Emp hrs: " +empHrs);
      }
      totalEmpWage = totalEmpHrs * empRatePerHour;
    }
      @Override
      public String toString(){
      return "total Emp Wage for Company:" +company + "is :" +totalEmpWage;
   }
      public static void main(String[] args){
      EmpWageBuilder Dmart = new EmpWageBuilder("Demart", 20,2,10);
      EmpWageBuilder Rmart = new EmpWageBuilder("Rmart", 10,4,20);
      Dmart.computeEmpWage();
      System.out.println(Dmart);
      Rmart.computeEmpWage();
      System.out.println(Rmart);
   }
}

