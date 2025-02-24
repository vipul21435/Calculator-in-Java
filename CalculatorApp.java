import java.util.Scanner;
import Operations.*;
public class CalculatorApp{
    public static void main(String[] args) {
      
         Scanner sc=new Scanner(System.in);

         System.out.println("Enter the first number");
         int num1=sc.nextInt();

         System.out.println("Enter the second number");
         int num2=sc.nextInt();

         System.out.println("Enter the operation you want to do");
         char c=sc.next().charAt(0);

         sc.close();

         ParentMethod res=getResult(c);
         if(res==null){
            System.out.println("Invalid Operation");
            return;
         }

         try{
            int result=res.calculate(num1,num2);
            System.out.println("Result: "+result);
         }
         catch(ArithmeticException e){
            System.out.println("Error: "+e.getMessage());  
         }
    }
    
    private static ParentMethod getResult(char c){
         switch (c) {
          case '+':
            return new Add();
          case '-':
             return new Subtraction();
          case '*':
             return new MultiPlication();
          case '%':
             return new Division();
          default:
             return null;
         }
    }
}
