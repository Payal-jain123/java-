import java.util.*;
class Findnumber
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("enter 1 no.");
int a = sc.nextInt();
System.out.println("enter 2 no.");
int b = sc.nextInt();
System.out.println("enter 3 no.");
int c = sc.nextInt();
if (a >= b && a >= c)
{ 
System.out.println("A is greater");
}
else if(b >= a && b >= c)
{ 
System.out.println("B is graetaer");
}
 else {
System.out.println("C is greater");
}
}
}
