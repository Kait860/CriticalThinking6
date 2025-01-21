import java.util.ArrayList;

public class Array {
    public static void main(String[] args) throws Exception {
        //creates an arrayList calles students
        ArrayList<Student> studentsList = new ArrayList<Student>();

        //adds students to list
        studentsList.add(new Student(9, "Xaden", "Devine, TX" ));
        studentsList.add(new Student(2, "Logan", "Hondo, TX"));
    }
}
