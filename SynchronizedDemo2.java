//is prgm. mein hume irregrular output milega kunki isme jo threads hain woh different java objects ko operate ke rahe hain.

class Display
{
public synchronized void wish(String name)
{
for(int i=0;i<10;i++)
{
System.out.print("Good Morning:");
try{
Thread.sleep(2000);
}
catch(InterruptedException e)
{
}
System.out.println(name);
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
class SynchronizedDemo2
{
public static void main(String [] args)
{
Display d1=new Display();//----1 d1 is one java object
Display d2=new Display();//----2 d2 is another java object
MyThread t=new MyThread(d1,"pyl");//operate d1 jave object
MyThread t1=new MyThread(d2,"adesh");//operate d2 java object
t.start();
t1.start();
}
}