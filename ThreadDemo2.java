class MyThread extends Thread
{
public void start()
{
super.start();
System.out.println("Start method");
}
public void run()
{
System.out.println("run method");
}
}
class ThreadDemo2
{
public static void main(String[]args)
{
MyThread t=new MyThread();
t.start();
System.out.println("main thread");
}
}