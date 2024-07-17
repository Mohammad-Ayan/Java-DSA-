public class constructorQues {
    class MyEmployeeList{
        private int id;
        private String name;
        private int salary;
        
        public void setEmployee1(){
            id = 45;
            name = "Rohan";
            salary = 10500;
        }

        public void setEmployee2(){
            id = 40;
            name = "Suzu";
            salary = 17500;
        }
        public void setEmployee3(){
            id = 46;
            name = "Quitz";
            salary = 19000;
        }


    // Getter for id
    public int getId() {
        return id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    }


public static void main(String[] args) {
    constructorQues MyProgram = new constructorQues();

    constructorQues.MyEmployeeList Employee1 = MyProgram.new MyEmployeeList();
    //MyEmployeeList Employee1 = new MyEmployeeList();
     Employee1.setEmployee1();
    System.out.println(Employee1.getId());
    System.out.println(Employee1.getName());
    System.out.println(Employee1.getSalary());
   

constructorQues.MyEmployeeList Employee2 = MyProgram.new MyEmployeeList();
   // MyEmployeeList.constructorQues Employee2 = new. MyEmployeeList();
   Employee2.setEmployee2();
    System.out.println(Employee2.getId());
    System.out.println(Employee2.getName());
    System.out.println(Employee2.getSalary());

    
constructorQues.MyEmployeeList Employee3 = MyProgram.new MyEmployeeList();
    //MyEmployeeList Employee3 = new MyEmployeeList();
     Employee3.setEmployee3();
    System.out.println(Employee3.getId());
    System.out.println(Employee3.getName());
    System.out.println(Employee3.getSalary());
   
}
}




