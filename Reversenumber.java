import java.util.Scanner;
 class Reversenumber  
{  
public static void main(String[] args)   
{  
int reverse=0,number;
Scanner sc=new Scanner(System.in);
System.out.print("enter a no.");
number=sc.nextInt();
for(;number != 0; number=number/10)   
{  
int remainder = number % 10;  
reverse = reverse * 10 + remainder;  
}  
System.out.println("The reverse of the given number is: " + reverse);  
}  
}  
