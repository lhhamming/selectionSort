import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(17);
        numbers.add(5);
        numbers.add(8);
        numbers.add(12);
        numbers.add(3);
        numbers.add(6);
        numbers.add(4);
        SelectionSort.doSelectionSort(numbers);
    }
}
