interface Father
{
public void bringWater();
}
interface Mother
{
public void bringWater();
}
public class Son implements Father,Mother
{
public void bringWater()
{
System.out.println("Brought water for father and mother");
}

public static void main(String args[])
{
Son s=new Son();
s.bringWater();
}
}

