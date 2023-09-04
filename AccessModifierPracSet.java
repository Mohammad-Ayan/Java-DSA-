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

    }
    public static void main(String[] args) {
     AccessModifierPracSet.cylinder myCylinder = new AccessModifierPracSet().new cylinder();
     myCylinder.setHeight(12);
     System.out.println(myCylinder.getHeight());
     myCylinder.setRadius(5);
     System.out.println(myCylinder.getRadius());

    }

}
