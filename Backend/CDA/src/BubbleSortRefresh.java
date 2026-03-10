import java.util.Arrays;

public class BubbleSortRefresh {
    public static void main(String[] args) {
        int arr[] = {84, 12, 1, 43, 5};
        int temp = 0;


        for (int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1] ) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;


                }
                System.out.println(Arrays.toString(arr));
            }

        }
    }
}
