package service;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Sorting {

    public void BubbleSorting(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            for (int j=0;j<arr.length-1-i;j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        printArray(arr);
    }

    private void printArray(int[] arr) {
        IntStream.of(arr).forEach(System.out::print);
    }
}
