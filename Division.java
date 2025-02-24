package Operations;

public class Division implements ParentMethod {
   @Override
    public int calculate(int num1,int num2){
        if(num2==0){
            throw new ArithmeticException("Cannot divide by zero");
        }
        return num1/num2;
    }
}
