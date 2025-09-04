interface Father
{
public void bringWater();
}
interface Mother
{
public void bringWater();
}
 class Son implements Father,Mother
{
public void bringWater()
{
System.out.println("Brought water for father and mother");
}
}

 class Grandson extends Son
{
public void name()
{
System.out.println("name is ABC");
}
}
 class Grandson2 extends Son
{
public void name()
{
System.out.println("name is PQR");
}
}

public class Hybrid
{
public static void main(String agrs[])
{
Son s=new Son();
s.bringWater();
Grandson s1=new Grandson();
s1.name();
Grandson2 s2=new Grandson2();
s2.name();
}
}

