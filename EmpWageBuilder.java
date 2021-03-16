public class EmpWageBuilder {
   public static void main(String[] args){
      int IS_FULL_TIME = 1;
      double empcheck =Math.floor(Math.random() * 10) % 2;
      if (empcheck == IS_FULL_TIME)
         System.out.println("Empoloyee is present");
      else
         System.out.println("Empoloyee is absent");
   }
}
