//creates a Student object class
public class Student{
    int rollno;
    String name;
    String address;

    //initializes Student
    public Student(int rollno, String name, String address){
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }
    
    //returns objects formatted to a string
    public String toString(){
        return "Roll Number = " + rollno + ", Name = " + name + ", Address = " + address;
    }
}