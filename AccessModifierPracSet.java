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

<<<<<<< HEAD

    public double Volumeofcylinder(){
    return 3.142*radius*radius*height;
    }
    public double surfaceArea(){
    return 2*3.142*radius*radius + 2*3.142*radius*height;
    }
}



=======
    }
>>>>>>> df667c6420ac43bb29a0509079a32e515511e7dd
    public static void main(String[] args) {
     AccessModifierPracSet.cylinder myCylinder = new AccessModifierPracSet().new cylinder();
     myCylinder.setHeight(12);
     System.out.println(myCylinder.getHeight());
     myCylinder.setRadius(5);
     System.out.println(myCylinder.getRadius());
<<<<<<< HEAD
     myCylinder.setLength(5);
     System.out.println(myCylinder.getLength());

     System.out.println(myCylinder.Volumeofcylinder());
     System.out.println(myCylinder.surfaceArea());
=======

>>>>>>> df667c6420ac43bb29a0509079a32e515511e7dd
    }

}
