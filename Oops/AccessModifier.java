
    class MyEmployee{
        private int id;
        private String name;

        public int getId(){
            return id;
        } 

        public void setId(int i){
            this.id = i;
        }

        public String getName (){
            return name;
        }
        public void setName (String n){
            this.name = n;
        } 
    }
    public class AccessModifier {
        public static void main(String[] args) {
            MyEmployee ayan = new MyEmployee();
            ayan.setName ("CodeWithMe");
            System.out.println(ayan.getName());
        }
    
    }

