public class Addition
{
public int add(int a ,int b)
{
int t=a+b;
return t;
}
public double add(double x ,double y ,double z)
{
double t=x+y+z;
return t;
}
public float add(int p ,int s ,int y ,int x)
{
float t=p+s+y+x;
return t;
}
public void add()
{
int a=10;
int b=20;
int t=a+b;
System.out.println("Addition is "+ t);
}
public static void main(String args[])
{ 
Addition a=new Addition();
a.add();
System.out.println("Addition of double numbers"+a.add(4.5,5.5,6.5));
System.out.println("Addition of integers numbers"+a.add(20,10));
System.out.println("Addition of float numbers"+a.add(0.1,0.2,0.3));
}
}