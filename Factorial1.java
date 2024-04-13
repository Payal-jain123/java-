import java.util.Scanner;
class Factorial1
{
public static void main(String[]args)
{
int i,fact=1,n;
Scanner ab=new Scanner(System.in);
System.out.println("enter a no.:");
n=ab.nextInt();
{
for(i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.println("factorial of no. is:"+fact);
}
}
}