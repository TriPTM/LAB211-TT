package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Text {
    private String text;

    public Text() {
        
    }
    
    public Text(String fPath){
        loadData(fPath);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    public void loadData(String fName){
        text="";
        BufferedReader sc;
        try {
            sc = new BufferedReader(new FileReader(fName));
            String s=null;
            while((s=sc.readLine())!=null){
                text+=s+"\n";
            }
            sc.close();
        } catch (Exception ex) {
            Logger.getLogger(Text.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void saveData(String fName){
        try {
            PrintWriter pw= new PrintWriter(new FileWriter(fName));
            pw.print(text);
            pw.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
