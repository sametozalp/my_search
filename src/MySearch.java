import java.util.ArrayList;

public class MySearch {

    public void bubbleSort(ArrayList<Integer> arrayList) {

        int size = arrayList.size();
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arrayList.get(j) > arrayList.get(j + 1)) {
                    int temp = arrayList.get(j);
                    arrayList.set(j, arrayList.get(j + 1));
                    arrayList.set(j + 1, temp);
                }
            }
        }
        System.out.println(arrayList);
    }

    public void selectionSort(ArrayList<Integer> arrayList) {
        int size = arrayList.size();

        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (arrayList.get(j) < arrayList.get(minIndex)) {
                    minIndex = j;
                }
            }

            int temp = arrayList.get(i);
            arrayList.set(i, arrayList.get(minIndex));
            arrayList.set(minIndex, temp);
        }
        System.out.println(arrayList);
    }

    // tam selection sort değil ama sıralama yapıyor
    public static void selectionSort2(ArrayList<Integer> arrayList) {

        int size = arrayList.size();

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arrayList.get(i) > arrayList.get(j)) {
                    int temp = arrayList.get(i);
                    arrayList.set(i, arrayList.get(j));
                    arrayList.set(j, temp);
                }
            }

            System.out.println(arrayList);
        }

    }

    public void insertionSort(ArrayList<Integer> arrayList) {
        int size = arrayList.size();

        for (int i = 1; i < size; i++) {
            int temp = arrayList.get(i);
            int j = i - 1;

            while (j >= 0 && temp < arrayList.get(j)) {
                arrayList.set(j + 1, arrayList.get(j));
                j--;
            }

            arrayList.set(j + 1, temp);
        }

        System.out.println(arrayList);
    }

}
