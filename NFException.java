public class NFException
{
public static void main(String args[])
{
String s="Saisha";
try{
int a=Integer.parseInt(s);
System.out.println(a);

}catch(Exception e)
{
System.out.println("String cannot be converted to integer"+e);
}

}
}