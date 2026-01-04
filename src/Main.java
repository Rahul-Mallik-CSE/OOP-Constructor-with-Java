
class Student{
    String name;
    int id;
    // If we don't write any constructor, Java provides a default No-Argument Constructor. That will be shown below: 
    public Student(){
        //empty body for default constructor
    }

    //Parameterized Constructor
    public Student(String n, int a){
        name= n;
        id= a;
    }


    public void calculateInterest(double balance){
        int id = 10; //this is local variable
        this.id = 20; // this.id refers to instance variable

        System.out.println("Local id: " + id); //acess local variable and prints 10
        System.out.println("Instance id: " + this.id); //access instance variable and prints 20

        if(balance > 1000){
            double interest = balance * 0.05; // **Scope of interest variable is only within this if block**
            System.out.println("Interest: " + interest);
        } else {
            double interest = balance * 0.03; // **Scope of interest variable is only within this else block**
            System.out.println("Interest: " + interest);
        }

    }
}

public class Main {
    public static void main(String[] args){
        
    // Using Default Constructor . if we define any constructor then default constructor is not provided by java and we can't use it without define it.
        Student s1 = new Student();
        System.out.println("Default Constructor:");
        System.out.println("Name: " + s1.name); // null
        System.out.println("Id: " + s1.id);   // 0

        
        // Using Parameterized Constructor
        Student s2 = new Student("Alice", 20);
        System.out.println("Parameterized Constructor:");
        System.out.println("Name: " + s2.name); // Alice
        System.out.println("Id: " + s2.id);   // 20
    }
}
