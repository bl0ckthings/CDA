public class ArraySmallerNumber {
    public static void main(String[] args) {
        int[] myArray = {5,9,7,474,5,4,2,1,89};
        int smallerNumber = myArray[0];
        System.out.println("This array contains " + myArray.length + " values");

        for (int i = 0; i < myArray.length; i++) {

                if(smallerNumber > myArray[i]) {
                smallerNumber = myArray[i];
                }
        }
        System.out.println("The smallest value is " + smallerNumber);
    }
}
