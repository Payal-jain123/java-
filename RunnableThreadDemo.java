class MyRunnable implements Runnable
{
public void run()
{
for(int i =0;i<10;i++)
{
System.out.println("child thread");
}}
}
class RunnableThreadDemo
{
public static void main(String[]args)
{
MyRunnable r=new MyRunnable();
Thread t=new Thread(r);//r is the target runnable if we are passing target runnable then myrunnable method will call
t.start();
for(int i=0;i<10;i++)
{
System.out.println("Main Thread");
}
}
}