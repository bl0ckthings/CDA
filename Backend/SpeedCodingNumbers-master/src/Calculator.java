public class Calculator {


    int[] arr = {4,5,7,9,11};


    public int comput(Integer num) {
        int sum = 0;
        int smallerNumber = 0;

        for (int i =0 ;i < arr.length; i++) {
            if (arr[i] < num) {
                for (int j = num - 1; j >= 1 ; j-- ) {
                        if(j % arr[i] == 0) {
                            smallerNumber = j + smallerNumber;
                        }
                }
            }
        }
        sum = smallerNumber;
        return sum;
    }

    private static int getNum(int num) {
        System.out.println(num--);
        return num;
    }
}
