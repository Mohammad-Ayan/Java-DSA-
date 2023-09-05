public class AccessModifierPracSet {

    class cylinder{
        private int  radius;
        
        public void setRadius(int radius){
           this.radius = radius;
        }

        private int height;

        public void setHeight(int height){
            this.height = height;
        }

        private int length;

        public void setLength(int length){
            this.length = length;
        }


    // Getter for radius
    public int getRadius() {
        return radius;
    }

    // Getter for length
    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }


    public double Volumeofcylinder(){
    return 3.142*radius*radius*height;
    }
    public double surfaceArea(){
    return 2*3.142*radius*radius + 2*3.142*radius*height;
    }
}

class Rectangle{

    private int length;
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    private int breadth;

    public int getBreadth() {
        return breadth;
    }
    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
    public Rectangle(){
        this.length = 4;
        this.length = 5;
    }
    public Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    
}



    public static void main(String[] args) {
//Problem 1
     AccessModifierPracSet.cylinder myCylinder = new AccessModifierPracSet().new cylinder();
     myCylinder.setHeight(12);
     System.out.println(myCylinder.getHeight());
     myCylinder.setRadius(5);
     System.out.println(myCylinder.getRadius());
     myCylinder.setLength(5);
     System.out.println(myCylinder.getLength());
//Problem 2
     System.out.println(myCylinder.Volumeofcylinder());
     System.out.println(myCylinder.surfaceArea());
//Problem 3
System.out.println(Area of a Rectangle);
    
    }

}

