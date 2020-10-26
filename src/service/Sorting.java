package service;

import java.util.stream.IntStream;

public class Sorting {

    /**
     * Swapping the adjustcent element if they are in wrong order.
     * Time Complexity O(n*n) and Space complexity O(1).
     *
     * @param arr Integer.
     */
    public static void bubbleSorting(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        IntStream.of(arr).forEach(System.out::print);
    }
}
