public class ArrayWithDie {
    public static void main(String[] args) {

        int[] arr = new int[500];

        for (int i = 0; i < arr.length; i++) {
            int randomNumber = (int) (Math.random() * 10 + 1);
            arr[i] = randomNumber;
            System.out.println("Value " + arr[i] + " index " + i );
        }

    }
}

