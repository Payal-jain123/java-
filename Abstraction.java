
abstract class Shape
{
abstract void draw();
}
class Rectangle extends Shape
{
void draw()
{
System.out.println("draw rectangle");
}
}
class Circle extends Shape
{
void draw()
{
System.out.println("draw circle");
}
}
class Abstraction
{
public static void main(String[] args)
{
Shape s1 = new Circle();
Shape s2 = new Rectangle();
s1.draw();
s2.draw();
}
}