public class EmpWageBuilder {
   public static final int IS_PART_TIME =1;
   public static final int IS_FULL_TIME =2;
   public static int computeEmpWage(String company, int empRatePerHour,
                           int numOfWorkingDays, int maxHourPerMonth){
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
      int totalEmpWage = totalEmpHrs * empRatePerHour;
      System.out.println("total Emp Wage :" +company + "is : "+ totalEmpWage);
      return totalEmpWage;
    }
      public static void main(String[] args){
      computeEmpWage("Demart", 20,2,10);
      computeEmpWage("Rmart", 10,4,20);
      }
}
