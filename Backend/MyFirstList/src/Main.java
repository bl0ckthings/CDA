import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List randomValues = new ArrayList<>();

        randomValues.add("Hello");
        randomValues.add(4);
        randomValues.add(5.5f);

        List<String> carBrands = new ArrayList<>();
        carBrands.add("A brand");
        carBrands.add("A cool brand");
        System.out.println(carBrands);

        ArrayList<String> namesList = new ArrayList<>();
        namesList.ensureCapacity(4);
        namesList.add("Joy");
        namesList.add("John");
        namesList.add("Eric");
        namesList.add("Nicolas");
        namesList.add("  ");
        namesList.add("  ");

        for (String name : namesList) {
            if(!namesList.contains("Boop")) { // Need to copy this Array and return with new values.
                namesList.add("Boop");
            }
            System.out.println(name);

        }

        List<String> letters = Arrays.asList("a", "b", "c", "d", "e");





    }
}