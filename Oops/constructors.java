    class MyMainEmployee{
        private int id;
        private String name;
        
        public MyMainEmployee(){
            id = 45;
            name = "Enter your name";
        }


    // Getter for id
    public int getId() {
        return id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    }
public class constructors {
public static void main(String[] args) {
    
    MyMainEmployee sam = new MyMainEmployee();
    System.out.println(sam.getId());
    System.out.println(sam.getName());

}
    
}
