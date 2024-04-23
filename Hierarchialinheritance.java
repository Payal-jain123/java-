class Animal
{
void eat()
{
System.out.println("eating..");
}
}
class Dog extends Animals
{
void bark()
{
System.out.println("barking..");
}
}
class Cat extends Animal
{
void meeow()
{
System.out.println("meeowing..");
}
}
class Hierarchialinheritance
{
public static void main(String[] args)
{

Cat c=new Cat();
c.meeow();
c.eat();

}
}