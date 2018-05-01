package ro.siit.java10.evp.ro.siit.java10.evp.service;

import java.util.List;

public class QuickSort {

    private QuickSort() {
    }

    public static <T extends Comparable<? super T>> List<T> sort(List<T> list) {
        quickSort(list, 0, list.size());
        return list;
    }

    private static <T extends Comparable<? super T>> List<T> quickSort(List<T> list, int start, int arrayLength) {
        if (start < arrayLength) {
            int q = partition(list, start, arrayLength);
            quickSort(list, start, q);
            quickSort(list, q + 1, arrayLength);
        }
        return list;
    }

    private static <T extends Comparable<? super T>> int partition(List<T> array, int end, int arrayLength) {
        T last = array.get(arrayLength - 1);
        int i = end - 1;
        for (int j = end; j < arrayLength - 1; j++) {
            if (array.get(j).compareTo(last) <= -1 || array.get(j).compareTo(last) == 0) {
                i = i + 1;
                exchange(j, i, array);
            }
        }
        exchange(arrayLength - 1, i + 1, array);
        return i + 1;
    }

    private static <T extends Comparable<? super T>> void exchange(int j, int i, List<T> array) {
        T temp = array.get(j);
        array.set(j, array.get(i));
        array.set(i, temp);
    }
}

