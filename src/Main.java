
class Student{
    String name;
    int age;
    // If we don't write any constructor, Java provides a default No-Argument Constructor. That will be shown below: 
    public Student(){
        //empty body for default constructor
    }
}

public class Main {
    public static void main(String[] args){
        Student s1 = new Student();
    }
}
