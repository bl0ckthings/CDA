public class BubbleSortOptimizedv2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int count = 0;
        int temp;
        boolean isSorted;

        for(int i = 0; i < arr.length; i ++) {
           isSorted = false;
            for(int j = 0; j< arr.length - 1; j++) {
                if(arr[j]> arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSorted = true;
                }

            }
            count++;
            if (!isSorted) break;
        }
        System.out.println("We went through the array " + count + " times");
    }
}
