//creates roll number comparator
import java.util.Comparator;

public class RollnoComparator implements Comparator<Student>{
    @Override
    public int compare(Student num1, Student num2){
        //compares students by roll number
        return num1.rollno - num2.rollno;
    }
}