public class ArrayWithScores {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int sum = 0;
        for(int i = 0; i< arr.length; i++) {
            int score = (int) (Math.random() * 20 +1 ) ;
            arr[i] = score;
            sum = sum + arr[i];
            System.out.println(arr[i]);
        }
        float averageScore = (float) sum / arr.length;
        System.out.println("The average score is " + averageScore);
    }
}

