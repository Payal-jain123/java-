
class Leapyearcomm
{
public static void main(String[] args)
{
System.out.println("Enter a  name of the year : ");
int year = Integer.parseInt(args[0]);
if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))

{
System.out.println(year + " is a leap year");
}

else{
System.out.println(year + " not a leap year");
}
}
}