//creates Name comparator
import java.util.Comparator;

public class NameComparator implements Comparator<Student>{
    @Override
    public int compare(Student num1, Student num2){
        //compares students by name
        return num1.name.compareTo(num2.name);
    }
}