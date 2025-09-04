public class ExceptionEx
{
public static void main(String args[])
{
int a=10,b=0;
int d=a+b;
System.out.println("Addition is :"+d);
try
{
int c=a/b;
System.out.println("Division is :"+c);
} 
catch(Exception e)
{
System.out.println("you cannot divide a no by zero"+e);
}
int f=a-b;
System.out.println("Subtraction is :"+f);
}
}