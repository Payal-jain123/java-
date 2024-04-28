//in this program we wil use get and set priority of a thread
class MyThread extends Thread
{

}
class ThreadDemo4
{
public static void main(String[]args)
{
System.out.println(Thread.currentThread().getPriority());

Thread.currentThread().setPriority(7);
Thread.currentThread().setPriority(1);
MyThread t=new MyThread();
System.out.println(t.getPriority());
}
}