public class ArrayWithDieAdvanced {
    public static void main(String[] args) {
        int[] arr = new int[501];
        int tenCount = 0;
        for (int i = 0; i < arr.length; i++) {
           int die = (int) (Math.random() * 10 + 1);
           arr[i] = die;
           if(die == 10) {
               tenCount++;
           }
           System.out.println("Value " + die + " index " + i);
        }

        System.out.println( " 10 rolled " + tenCount + " times");


    }
}
