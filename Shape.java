public class Shape
{
public void area()
{
int l=27;
int b=45;
int t=l*b;
System.out.println("Area of rectangle is"+t);
}
public double area(int r)
{
double t=3.14*r*r;
return t;
}
public double area(int b ,int h)
{
double t=0.5*b*h;
return t;
}
public static void main(String args[])
{
Shape s=new Shape();
s.area();
System.out.println("Area of triangle is"+s.area(23,56));
System.out.println("Area of Circle  is"+s.area(3));
}
}

