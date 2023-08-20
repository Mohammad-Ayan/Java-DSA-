
class Employee{
int id;
String name;


public void PrintDetails(){
    System.out.println("My id is "+ id);
    System.out.println("My name is "+ name);


}

}


public class custom {
    public static void main(String[] args) {
       Employee aynye = new Employee();
       Employee Zohra = new Employee();


        System.out.println("It is our custom class");
        aynye.id = 23;
        aynye.name = "aynye";

        Zohra.id = 17;
        Zohra.name = "Zohra";

        aynye.PrintDetails();
        Zohra.PrintDetails();
    }
    
}
