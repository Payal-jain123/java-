import java.util.*;
class Palindrome1
{
public static void main(String[]args)
{
int r,sum=0,temp,n;
Scanner sc =new Scanner(System.in);
System.out.println("enter a number..");
 n=sc.nextInt();	

temp=n;


while(n>0)
{
r=n%10;
sum=(sum*10)+r;
n=n/10;
}
if(temp==sum)
{
System.out.println("it is palindrome..");
}
else
{
System.out.println("it is not palindrome..");
}
}
}