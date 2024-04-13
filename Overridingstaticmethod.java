class Parentclass
{
public static void display()
{
System.out.println("parent");
}
}
class Childclass extends Parentclass
{
public static void display()
{
System.out.println("child");
}
}
class Overridingstaticmethod
{
public static void main(String[] args)
{
Parentclass p1 = new Parentclass();
p1.display();//parent
Childclass c1 = new Childclass();
c1.display();//child
Parentclass p=new Childclass();
p.display();//parent
}
}