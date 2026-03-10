import service.ISymptomsReader;
import service.ISymptomsWriter;

import java.io.*;
import java.util.*;

public class ComputeData implements ISymptomsReader, ISymptomsWriter {

    @Override
    public ArrayList<String> getSymptoms(String filepath) throws Exception {
        File myObj = new File(filepath);
        ArrayList<String> symptoms = new ArrayList<>();
        try (Scanner myReader = new Scanner(myObj)) {
            while(myReader.hasNextLine()) {
                String data = myReader.nextLine();
                symptoms.add(data);

            }

        } catch (FileNotFoundException e) {
            System.out.println("Error");
        }
        return symptoms;
    }

    public TreeMap<String, Integer> compute(ArrayList<String> unsortedSymptoms) {

        TreeMap<String, Integer> sortedSymptoms = new TreeMap<>();

        for (String symptom : unsortedSymptoms) {
            if(!sortedSymptoms.containsKey(symptom)) {
                sortedSymptoms.put(symptom, 1);
            } else {
                sortedSymptoms.put(symptom, sortedSymptoms.get(symptom)+ 1);
            }
        }
        return sortedSymptoms;
    }

    @Override
    public File createFile(String fileName) throws IOException {
        File results = new File(fileName);
        if(results.createNewFile()) {
            System.out.println("File created: " + results.getName());

        } else {
            System.out.println("File already exists");
        }
        return results;
    }

    @Override
    public void writeSymptomsToFile(TreeMap<String, Integer> sortedSymptoms, File results) throws IOException {

        String formattedResults = " ";
        BufferedWriter writer = new BufferedWriter(new FileWriter(results, true));

        for (Map.Entry<String, Integer> entry : sortedSymptoms.entrySet()) {
             formattedResults = entry.getKey() + " = " + entry.getValue();
             writer.write(formattedResults);
             writer.newLine();
             System.out.println(formattedResults);
        }
        writer.close();

        System.out.println("Successfully appended to the file");


    }

}
