class Shape
{
public void area()
{
System.out.println("In shape class");
}
}

public class Circle extends Shape
{
public void area()
{
System.out.println("In circle class");
super.area();
}

public static void main(String args[])
{
Circle c=new Circle();
c.area();
}
} 