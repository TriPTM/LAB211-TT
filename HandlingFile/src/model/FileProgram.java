
package model;

import Library.Validation;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class FileProgram {
    private Validation val = new Validation();
    
    public FileProgram() {
    }
    
    public ArrayList<Person> getPerson(String inputFile, double money){
        ArrayList<Person> pList = new ArrayList<Person>();
        try {
            Scanner sc = new Scanner(new FileReader(inputFile));           
            while(sc.hasNextLine()){
                String s = sc.nextLine();
                String[] st = s.split(";");
                if(st.length==3){
                    double amount = val.checkNumberFromDatabase(st[2]);
                    if(amount>=money) pList.add(new Person(st[0],st[1],amount));
                }
            }
            sc.close();
            
        } catch (FileNotFoundException ex) {
            System.out.println("File not found: " + ex.getMessage());
        } catch (Exception ex){
            System.out.println("Can't read file: " + ex.getMessage());
        }
        return pList;
    }
    
    public void copyWordOneTimes(String inputFile, String outputFile){
        File file = new File(outputFile);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        
        try {
            Scanner sc = new Scanner(new FileReader(inputFile));
            PrintWriter pw= new PrintWriter(new FileWriter(file));
            
            HashSet<String> getContent = new HashSet<String>();
            while(sc.hasNext()){
                getContent.add(sc.next());
            }
            
            for(String word:getContent){
                pw.print(word + " ");
            }
            
            sc.close();
            pw.close();
            
        } catch (FileNotFoundException ex) {
            System.out.println("File not found: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Can't write file: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Can't read file: " + ex.getMessage());
        }
    }
}
