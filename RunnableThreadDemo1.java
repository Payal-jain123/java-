class MyRunnable implements Runnable
{
public void run()
{
for(int i =0;i<10;i++)
{
System.out.println("child thread");
}}
}
class RunnableThreadDemo1
{
public static void main(String[]args)
{
MyRunnable r=new MyRunnable();
Thread t=new Thread();//if we are not passing target runnable then thread class run method will call(onlyv call main method)
t.start();
for(int i=0;i<10;i++)
{
System.out.println("Main Thread");
}
}
}