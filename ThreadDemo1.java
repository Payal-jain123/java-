//in this program child thread will execute fully first and then the main //thread execute becoz we comment line 1 and using t.run method.

class MyThread extends Thread
{
public void run()
{
for(int i=0;i<10;i++)
{
System.out.println("child Thread");
}
}
}
class ThreadDemo1
{
public static void main(String[]args)
{
MyThread t=new MyThread();
//t.start();-----line 1
t.run();
for(int i=0;i<10;i++)
{
System.out.println("Main Thread");
}
}
}