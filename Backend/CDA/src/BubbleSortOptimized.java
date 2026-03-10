public class BubbleSortOptimized {
    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 2, 4};
        int count = 0;
        int temp = 0;
        boolean isSorted = true;

        while(isSorted) {
            isSorted = false;

            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    isSorted = true;
                }

            }
            count++;
        }
        System.out.println("We went trough the array " + count + " times");


    }

}

