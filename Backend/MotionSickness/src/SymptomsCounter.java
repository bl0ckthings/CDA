
import java.io.FileNotFoundException;
import java.io.File;
import java.util.*;

public class SymptomsCounter  {
    public static void main(String[] args) throws Exception {
        ComputeData computeData = new ComputeData();
        // This method will extract the data from symptoms.txt and store into an ArrayList
        ArrayList<String> symptoms = computeData.getSymptoms("symptoms.txt");
        // This method will sort the symptoms in alphabetical order and count the number of time a symptom is redundant
        TreeMap<String, Integer> sortedSymptoms = computeData.compute(symptoms);
        // Create the file
        File resultFile = computeData.createFile("results.txt");
        // Write symptoms to file with correct formatting
        computeData.writeSymptomsToFile(sortedSymptoms, resultFile);

        
        }


}
