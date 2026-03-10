package service;

import java.io.File;
import java.io.IOException;
import java.util.TreeMap;

public interface ISymptomsWriter {

     public File createFile(String fileName) throws IOException;
     public void writeSymptomsToFile(TreeMap<String,Integer> sortedSymptoms, File results) throws  IOException;


}
