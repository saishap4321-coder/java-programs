public class NullEx
{
public static void main(String args[])
{
try{
String s=   ;
System.out.println("length is"+s.length());
}catch(Exception e)
{
System.out.println("length of null string cannot be calculated"+e);
}
}
}