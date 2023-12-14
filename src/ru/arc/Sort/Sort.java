package ru.arc.Sort;


public class Sort {

    public static void main(String[] args) {
        final int[] source = {5, 3, 2, 10, 8, 15, 6, 1, 4, 76, 3, 76, 5, 8, 5, 98};
        int[] result = new int[source.length];
        sort(source, result);

    }

    public static void sort(int[] source, int[] result) {
        if (source == null) return;

        int[] left = new int[source.length / 2];
        int[] right = new int[source.length / 2];
        for (int i = 0; i < source.length / 2; i++) {
            left[i] = source[i];
        }
        for (int i = source.length / 2; i < source.length; i++) {
            right[i - source.length / 2] = source[i];
        }
        printArray(left);
        printArray(right);
        if (left.length <= 1) {
            if (left[0] > right[0]) {
                int[] temp = left;
                left = right;
                right = temp;
                result = mergeArrays(left, right);
            }
            result = mergeArrays(left, right);
        } else {
            sort(left, result);
            sort(right, result);
        }
        printArray(result);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println();
    }

    public static int[] mergeArrays(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];
        }
        for (int i = 0; i < a.length; i++) {
            result[i + a.length] = b[i];
        }
        return result;
    }

}
