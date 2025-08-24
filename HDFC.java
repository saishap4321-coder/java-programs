class RBI
{
public void roi()
{
System.out.println("In RBI class");
}
}
public class HDFC extends RBI
{
public void roi()
{
System.out.println("In HDFC class");
super.roi();
}

public static void main(String args[])
{
HDFC h=new HDFC();
h.roi();

} 
}