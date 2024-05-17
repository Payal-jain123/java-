class Animal12{  
void eat(){System.out.println("eating...");}  
}  
class Dog extends Animal{  
void bark(){System.out.println("barking...");}  
}  
class TestInheritance{  
public static void main(String args[]){  
Animal12 d=new Dog();  
d.bark();  
d.eat();  
}}  