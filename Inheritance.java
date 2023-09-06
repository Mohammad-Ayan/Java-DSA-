class Base{
    int x;

    public int get(){
        return x;
    }

    public void setX(int x){
        System.out.println("I am in Base and setting x now");
        this.x = x;
    }
    
    public void printMe(){
        System.out.println("I am a constructor");
    }
}
class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}


public class Inheritance {
    public static void main(String[] args) {
        //Creating an object of Base class 
        Base b = new Base();
        b.setX(4);
        System.out.println(b.get());
       //Creating an object of Derieved class 
        Derived d = new Derived();
        d.setX(4);
        System.out.println(d.get());
       
       }
}
