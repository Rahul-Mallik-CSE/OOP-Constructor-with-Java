
class Student{
    String name;
    int age;
    // If we don't write any constructor, Java provides a default No-Argument Constructor. That will be shown below: 
    public Student(){
        //empty body for default constructor
    }

    //Parameterized Constructor
    public Student(String n, int a){
        name= n;
        age= a;
    }
}

public class Main {
    public static void main(String[] args){
        
    // Using Default Constructor . if we define any constructor then default constructor is not provided by java and we can't use it without define it.
        Student s1 = new Student();
        System.out.println("Default Constructor:");
        System.out.println("Name: " + s1.name); // null
        System.out.println("Age: " + s1.age);   // 0

        
        // Using Parameterized Constructor
        Student s2 = new Student("Alice", 20);
        System.out.println("Parameterized Constructor:");
        System.out.println("Name: " + s2.name); // Alice
        System.out.println("Age: " + s2.age);   // 20
    }
}
