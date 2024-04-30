
class Display
{
public void wish(String name)
{
//lakh of lines of code
synchronized(Display.class)//using synch.block(this)
{
for(int i=0;i<10;i++)
{
System.out.print("Good Morning:");
try{
Thread.sleep(1000);
}
catch(InterruptedException e)
{
}
System.out.println(name);
}
}
}
}
class MyThread extends Thread
{
Display d;
String name;
MyThread(Display d,String name)
{
this.d=d;
this.name=name;
}
public void run()
{
d.wish(name);
}
}
class SynchronizedBlockDemo1
{
public static void main(String[]args)
{
Display d=new Display();
MyThread t=new MyThread(d,"pyl");
MyThread t1=new MyThread(d,"adeesh");
t.start();
t1.start();
}
}