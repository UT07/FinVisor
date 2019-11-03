
import java.util.Scanner;


public class ProjectHACKTX {
/*public static double Income(double balance)
{
    double result=0;
    double income=userInteger("Please enter your annual income \n");
         balance+=income;
         System.out.printf("Your new balance is %f",balance);
}*/

   public static double userInteger(String message)
  {
    Scanner in = new Scanner(System.in);
    double result;
    while (true)
    {
      System.out.printf(message);
      String s = in.next();
      if (s.equals("q"))
      {
        System.out.printf("Exiting...\n");
        System.exit(0);
      }
      
      try
      {
        result = Double.parseDouble(s);
      } 
      catch (Exception e)
      {
        System.out.printf("%s is not a valid number, try again.\n\n", s);
        continue;
      }
      
      if (result <= 0)
      {
        System.out.printf("%s is <= 0, try again.\n\n", s);
        continue;
      }
      return result;
    }
  }
    public static void main(String[] args)  {
       
       
      
        Scanner in= new Scanner(System.in);
        double balance=0,income=0,expenditure=0,budget=0;
        
        
        System.out.printf("Welcome to your Income Friendly Tracker \n");
        balance=userInteger("Please enter your balance \n");
   while (true)
   { 
       
        
       
        System.out.print("Press b to look your balance\n"); 
        System.out.print("Press a to add your income\n");
        System.out.print("Press e to add any expenditure \n");
        System.out.print("Press bud to set a budget \n"); 
        System.out.print("Press q to exit \n");
        String m=in.next();
        
             if(m.equals("b")){
                 System.out.printf("Your balance is: %.2f \n",balance);
             }
        else if(m.equals("a"))
        {
         income=userInteger("Please enter your annual income \n");
         balance+=income;
         System.out.printf("Your new balance is %.2f \n",balance);
        }
         else if(m.contains("bud"))
        {
         budget=userInteger("Please set a monthly budget \n");
        
        }   
        else if(m.equals("e")){
         expenditure=userInteger("Please add any expenditure \n");
         if(budget<=balance){
         if(expenditure<=budget){
         System.out.print("Your transaction has been noted \n");
         balance-=expenditure;
         budget-=expenditure;
         System.out.printf("Your monthly limit is %.2f \n",budget);
          System.out.printf("Your new balance is %.2f \n",balance);   
         }
         else
         {
             System.out.print("You've crossed your spending limit, You still want to make that transaction (y/n) \n");
             String s=in.next();
             if (s.equals("y")){
                 balance-=expenditure;
             System.out.printf(" Your transaction is saved, Your updated balance is %f \n",balance);
                     }
             else
             {
                 System.out.print("You're good with your goal \n");
                 System.out.printf("Your spending limit is over\n");
                 System.out.printf("Your balance is %.2f \n",balance);
             }
         }
  
         
        }
         else
         {
           System.out.println("Budget is more than Expenditure");
           break;
         }
        }
       else if(m.equals("q"))   
            System.exit(0);
        else {
        System.out.print("Please choose a valid option \n");
        break;
        }
         
   }
}
}