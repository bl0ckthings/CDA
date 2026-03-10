import java.util.ArrayList;
import java.util.ConcurrentModificationException;

public class Exceptions {
    public static void main(String[] args) {
        try {
            int[] anArray = {1, 2, 3};
            System.out.println(anArray[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Something when wrong " + e.getMessage());
            int[] anArray = {1, 2, 3};
            System.out.println(anArray[2]);
        } finally {
            System.out.println("The try catch is finished");
        }


        ArrayList<String> namesList = new ArrayList<>();
        namesList.add("John");
        namesList.add("Kook");
        namesList.add("Bebut");

        try {
            for (String name : namesList) {
                if (!namesList.contains("Beep")) {
                    namesList.add("Beep");
                }
                System.out.println(name);
            }
        } catch (Exception e) {
                System.out.println("ERROR");
                for (String name : namesList) {
                    if(namesList.contains("John")) {
                        System.out.println(name);
                    }

                }
        }


    }
}
