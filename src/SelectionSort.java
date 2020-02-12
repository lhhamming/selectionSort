import java.util.ArrayList;
import java.util.Collections;

public class SelectionSort {



    public static void doSelectionSort(ArrayList<Integer> toSortArray){
        int index = 0;
        while(index < toSortArray.size()){
            int smallestNumberIndex = index; //We beginnen bij het kleinste getal.

            //Dan gaan we door de array heen loopen

            //We willen 1 verder beginnen dan bij de index waar wij eerst waren.
            //Dit doen wij zodat we op 1 plek naast het gewisselde nummer kunnen kijken
            for (int i = index + 1; i < toSortArray.size(); i++) {
                //Als we een kleiner getal gevonden hebben dan in onze index
                //Zetten wij de smallesNumberIndex op i, zodat wij de index kunnen onthouden voor later.
                if(toSortArray.get(smallestNumberIndex) > toSortArray.get(i)){
                    smallestNumberIndex = i;
                    System.out.println("I swappd them!");
                }
            }

            //Nu moeten wij het omdraaien
            swapElements(toSortArray, index, smallestNumberIndex);
            index = index + 1;
        }

        for (Integer i : toSortArray){
            System.out.println(i);
        }
    }

    private static void swapElements(ArrayList<Integer> toEditArray, int oldIndex, int newIndex) {
        //17 en 3 moeten omruilen. We onthouden dus beide getallen.
        int oldIndexNumber = toEditArray.get(oldIndex);
        int newIndexNumber = toEditArray.get(newIndex);

        toEditArray.set(oldIndex, newIndexNumber);
        toEditArray.set(newIndex, oldIndexNumber);
    }
}
