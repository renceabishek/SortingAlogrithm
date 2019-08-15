import service.Sorting;

public class Sample {
    public static void main(String[] args) {
        int[] arr ={3,4,2,9,5,1};
        Sorting sort=new Sorting();
        System.out.println("Bubble Sorting..");
        sort.BubbleSorting(arr);
    }
}
