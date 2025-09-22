public class ThrowEx
{
public static void main(String args[])
{
int age=14;
if(age<18)
{
System.out.println("you are not eligible");
throw new ArithmeticException("You are not eligible for voting");
}
else
{
System.out.println("You are eligible ");
}
System.out.println("Welcome");
}
}

