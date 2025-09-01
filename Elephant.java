interface Animal
{
public void voice();
}

public class Elephant implements Animal
{
public void voice()
{
System.out.println("In Elephant voice");
}
public static void main(String args[])
{
Animal a=new Elephant();
a.voice();
}
}