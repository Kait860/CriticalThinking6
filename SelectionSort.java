import java.util.ArrayList;
import java.util.Comparator;

public class SelectionSort {
    public <T> void selectionSort(ArrayList<T> array, Comparator<T> comparator){
        int amount = array.size();
        for(int i = 0; i < amount - 1; i++){
            int min = i;
            for(int j = i + 1; j < amount; j++){
                if(comparator.compare(array.get(j), array.get(min)) < 0){
                    min = j;
                }
            }
            T t = array.get(min);
            array.set(min, array.get(i));
            array.set(i, t);
        }
    }
}