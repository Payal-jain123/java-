class Methodoverloading
{
public int add(int a,int b)
{
return a+b;
}
public int add(int a,int b, int c)
{
return a+b+c;
}
public double add(double a,double b)
{
return a+b;
}
public double add(double a,double b , double c)
{
return a+b+c;
} 
public String add(String a,String b)
{
return a+b;
}
public static void main(String[] args)
{
Methodoverloading m = new Methodoverloading();
System.out.println("sum of 5 and 10 is:"+m.add(5,10));
System.out.println("sum of 5,5 and 20 is:"+m.add(5,10));
System.out.println("sum of 5.15 and 1.5 is:"+m.add(5,10));
System.out.println("combination of 'hello' and 'world' is:"+m.add("hello","world"));
}
}




