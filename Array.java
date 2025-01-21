import java.util.ArrayList;

public class Array {
    public static void main(String[] args) throws Exception {
        //creates an arrayList calles students
        ArrayList<Student> studentsList = new ArrayList<Student>();

        //adds 10 students to list
        studentsList.add(new Student(9, "Xaden", "Devine, TX" ));
        studentsList.add(new Student(2, "Logan", "Hondo, TX"));
        studentsList.add(new Student(3, "David", "Potranco, TX"));
        studentsList.add(new Student(6, "Alice", "Lytle, TX"));
        studentsList.add(new Student(1, "Nico", "Devine, TX"));
        studentsList.add(new Student(4, "Alex", "Potranco, TX"));
        studentsList.add(new Student(5, "Michael", "Hondo, TX"));
        studentsList.add(new Student(7, "Gabriel", "Lytle, TX"));
        studentsList.add(new Student(8, "Josephine", "Potranco, TX"));
        studentsList.add(new Student(10, "Willow", "Lytle, TX"));

        //print the Original list
        System.out.println("Original: ");
        for (int i =0; i< 10; i++){
            System.out.println(studentsList.get(i));
        }

        //print the list sorted by roll number
        

        //prints the list sorted by name
    }
}
