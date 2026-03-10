import java.util.Scanner;


public class App {
    /**
    Your program will get an input. The input is a number.
     It will provide an output with the result.

     The result will be an addition of all the numbers that are smaller than the input and that are
     a multiple of any number of the list.
     Here is a list of numbers : 4,5,7,9,11
    example : 16 for the input will return 95 for the output.
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        Calculator calculator = new Calculator();
        System.out.println(calculator.comput(number));

    }
}