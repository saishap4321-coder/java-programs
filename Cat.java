 abstract class Animal
{
public abstract void voice();
public void move()
{
System.out.println("Animal is moving");
}
}
public class Cat extends Animal
{
public void voice()
{
System.out.println("In Cat class");
}
public static void main(String args[])
{
Cat c=new Cat();
c.voice();
c.move();
}
}