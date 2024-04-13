class Animals
{
public void sound()
{
System.out.println("many sounds animals have");
}
}
class Dog extends Animals
{
public void sound()
{
System.out.println("dog sound");
}
}
class Methodoverriding
{
public static void main(String[] args)
{
Animals a=new Animals();
Dog d =new Dog();
d.sound();
a.sound();
}
}

