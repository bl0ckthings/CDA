public class Bubblesort {
public static void main(String[] args) {
    int[] arr = {1,2,3,4,6,5};
    int temp = 0;
    temp = arr[4];

    arr[4] = arr[5];

    arr[5] = temp;

    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
}

}
