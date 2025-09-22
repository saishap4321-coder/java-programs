import java.util.*;
public class FinallyEx
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();

try
{
int c=a/b;
System.out.println("division is"+c);
}
catch(Exception e)
{
System.out.println("cannot divide by zero");
}
finally
{
System.out.println("inputs are"+a+" and"+b);
}
}
}