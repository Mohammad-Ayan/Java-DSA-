public class Oops {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // created a pen object p1.
        p1.setColor("Yellow");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);

        BankAccount myAcc = new BankAccount();
        myAcc.username = "Ayan";
        // myAcc.password = "pqr" //Can't be accessed As it is Private
        myAcc.setPassword("abcd"); // It will just change, Can't be accessed
    }
}

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }

}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage;

    void calPercentage(int Phy, int Maths, int Chem) {
        percentage = (Phy + Maths + Chem / 3);
    }

    // -----------Getters and Setters------------

    public static void main(String[] args) {
        Pen1 p2 = new Pen1(); // created a pen object p1.
        p2.setColor("Yellow");
        System.out.println(p2.getColor());
        p2.setTip(5);
        System.out.println(p2.getTip());
    }
}

class Pen1 {
    private String color;
    private int tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }

//     // --------------Constructor------------

    public static void main(String[] args) {
        Students s3 = new Students();
        Students s4 = new Students("Ayan");
        Students s5 = new Students(1234);

    }
}

class Students {
    String name;
    int roll;

    Students() {
        System.out.println("Constructor is called...");
    }

    Students(String name) {
        this.name = name;
    }

    Students(int roll) {
        this.roll = roll;
    }

    // -----------Inheritance---------------

    public static void main(String[] args) {
        Dog tom = new Dog();
        tom.legs = 4;
        tom.eat();
        System.out.println(tom.legs);
    }
//}

    // Base Class
    class Animal {
        String color;

        void eat() {
            System.out.println("eats");
        }

        void breathe() {
            System.out.println("breathes");
        }
    }

    //Derived Class
    // class Fish extends Animal{
    //     int fins;

    //     void swim(){
    //         System.out.println("Swims in water");
    //     }
    //}

    //Derived Class
    class Mammal extends Animal{
        int legs;
    }

    //Derived Class
    class Dog extends Mammal{
        String breed;
    }

//-------------Polymorphism--------------

//--Function Overloading--
    public static void main(String[] args) {
        Calculator calci = new Calculator();
        System.out.println(calci.sum(1,2));
        System.out.println(calci.sum((float)1.5,(float)2.4));
        System.out.println(calci.sum(1,2, 2));
    }
//}

    class Calculator{
        int sum(int a,  int b){
            return a + b;
        }
        float sum(float a,  float b){
            return a + b;
        }
        int sum(int a,  int b, int c){
            return a + b + c;
        }
    }

//--Function Overriding--

    public static void main(String[] args) {
        Deer bn = new Deer();
        bn.eat();
    }
}

    class Animal{
        void eat(){
            System.out.println("eats anything");
        }
    }
    class Deer extends Animal{
        void eat(){
            System.out.println("eats grass");
        }

// ----------Abstraction---------

    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);

        Mustang myhorse = new Mustang();
        // Animal -> Horse -> Mustang (Order of Constructr is being called) 
    }
}

    abstract class Animal{
        String color;

        Animal(){
            System.out.println("Animal constructor is called");
        }
        void eat(){
            System.out.println("animals eats");
        }

        abstract void walk();
    }

    class Horse extends Animal{
        Horse(){
            System.out.println("Horse constructor is called" );
        }
        void changeColor(){
            color = "Dark Brown";
        }
        void walk(){
            System.out.println("walks on 4 legs");
        }
    }

    class Mustang extends Horse{
        Mustang(){
            System.out.println("Mustang constructor is called");
        }
    }
    class Chicken extends Animal{
        void changeColor(){
            color = "Yellow";
        }
        void walk(){
            System.out.println("walks on 2 legs");
        }
    }

//----------Interface-----------

    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}

    interface ChessPlayer{
        void moves();
    }

    class Queen implements ChessPlayer{
        public void moves() {
            System.out.println("up, down, left, right, daigonal (all direction)");
        }
    }

    class Rook implements ChessPlayer{
      public void moves() {
            System.out.println("up, down, left, right,");
        }
    }

    class King implements ChessPlayer{
        public void moves() {
            System.out.println("up, down, left, right, daigonal (by 1 step)");
         }
    }

// --------Implement Multiple Inheritance using Interface--------

    public static void main(String[] args) {
        Bear boo = new Bear();
            boo.flesh();
            boo.plants();
    }
}

    interface Carnivores{
         void flesh();
    }

    interface Herbivores{
        void plants();

    }
     
    class Bear implements Carnivores, Herbivores {
        public void flesh(){
            System.out.println("Eats Flesh");
        }
        public void plants(){
            System.out.println("Eats plants");
        }
    }
   