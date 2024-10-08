import java.util.Scanner;
class exception
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number");
int numerator=sc.nextInt();
System.out.println("Enter the Dinominator");
int denominator=sc.nextInt();
int result=0;
try
{
if(denominator==0)
{
throw new ArithmeticException("Division by zero is not alowed:");
}
result=numerator/denominator;
}
catch(ArithmeticException e)
{
System.out.println("Exception caught:"+e.getMessage());
}
finally
{
System.out.println("Finally block executed");
}
System.out.println("Result:"+result);
}
}
