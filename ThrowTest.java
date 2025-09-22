public class ThrowTest
{
public static void main(String args[])
{

int a=10;
int b=0;

if(b==0)
{
throw new ArithmeticException("You cannot divide a number by zero");
}
else
{
int c=a/b;
System.out.println("Division is"+c);
}
System.out.println("Addition is"+(a+b));
}
}