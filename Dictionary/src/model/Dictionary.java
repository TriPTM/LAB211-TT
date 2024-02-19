
package model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Dictionary {
    private String inputFile;
    private String outputFile;
    private HashMap<String,String> dictionary = new HashMap<>();

    public Dictionary(String inputFile, String outputFile) {
        this.inputFile = inputFile;
        this.outputFile = outputFile;
    }
    
    public void loadData(){
        try {
            Scanner sc = new Scanner(new FileReader(inputFile));
            while(sc.hasNextLine()){
                String s = sc.nextLine();
                String[] st = s.split(",");
                if(st.length==2){
                    dictionary.put(st[0], st[1]);
                }
                sc.close();
            }
        } catch (FileNotFoundException ex) {
           System.out.println("File not found: " + ex.getMessage());
        }
    }
    
    public void updateDatabase(){
        try {
            PrintWriter pw= new PrintWriter(new FileWriter(outputFile));
            for(String s:dictionary.keySet()){
                pw.println(s+","+dictionary.get(s));
            }
            pw.close();
        } catch (IOException ex) {
            Logger.getLogger(Dictionary.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getInputFile() {
        return inputFile;
    }

    public void setInputFile(String inputFile) {
        this.inputFile = inputFile;
    }

    public String getOutputFile() {
        return outputFile;
    }

    public void setOutputFile(String outputFile) {
        this.outputFile = outputFile;
    }

    public HashMap<String, String> getDictionary() {
        return dictionary;
    }

    public void setDictionary(HashMap<String, String> dictionary) {
        this.dictionary = dictionary;
    }
    
}
