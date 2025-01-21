import java.util.ArrayList;
import java.util.Comparator;

//sorts the data
public class SelectionSort {
    public static <T> void sort(ArrayList<T> array, Comparator<T> comparator){
        int amount = array.size();
        for(int i = 0; i < amount - 1; i++){
            int min = i;
            //runs through array for comparison
            for(int j = i + 1; j < amount; j++){
                if(comparator.compare(array.get(j), array.get(min)) < 0){
                    min = j;
                }
            }
            //sets t to minimum
            T t = array.get(min);
            array.set(min, array.get(i));
            array.set(i, t);
        }
    }
}