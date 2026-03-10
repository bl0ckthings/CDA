import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> arrList = new ArrayList<>();
        arrList.add("John");
        arrList.add("Boope");
        arrList.add("Doe");
        arrList.add("Walid");
        arrList.add("Kook");
        arrList.add("CDA");

        System.out.println(arrList);
        arrList.stream().map()
        Map<List<String>, Integer> treeMap = new TreeMap<>();
        treeMap.put(arrList, 5);

        System.out.println(treeMap);
   }


}