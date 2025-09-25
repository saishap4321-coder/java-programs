class MyThread extends Thread
{
public void  run()
{
System.out.println("Thread extending Thread class running");
}
}

public class ThreadExample
{
public static void main(String args[])
{
MyThread thread1=new MyThread();
thread1.start();
}
}