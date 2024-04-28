class MyThread extends Thread
{
public void run()
{
System.out.println("payal");
}
}
class ThreadDemo6
{
public static void main(String[]args)
{
MyThread t1=new MyThread();
MyThread t2=new MyThread();
System.out.println("thread t1 has name:"+t1.getName());
System.out.println("thread t2 has name:"+t2.getName());
System.out.println(Thread.currentThread().getName());
t1.setName("pihu");
System.out.println("after changing thread t1 has name:"+t1.getName());
}
}
