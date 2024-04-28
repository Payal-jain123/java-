//in this program we wil use get and set name of a thread
class MyThread extends Thread
{
public void run()
{
System.out.println("run method");
}
}
class ThreadDemo3
{
public static void main(String[]args)
{
System.out.println(Thread.currentThread().getName());
MyThread t=new MyThread();
t.start();
System.out.println(t.getName());
Thread.currentThread().setName("pyl Jain");
System.out.println(Thread.currentThread().getName());
}
}