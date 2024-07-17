class Animal{

    public void speak(){
    System.out.println("The animals make Sound");
    }

    class Dog extends Animal{
    public void dogs(){
        System.out.println("Dogs barks");
    }
}
}
public class ExampleOfInheritance{
    public static void main(String[] args) {
Animal animal = new Animal();
Animal dog = animal.new Dog();
 System.out.println("Animals");
animal.speak();
  System.out.println("Dogs"); 
 dog.speak();
}
}


