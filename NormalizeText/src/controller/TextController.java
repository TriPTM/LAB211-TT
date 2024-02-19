package controller;

public class TextController {
    
    public static String normalizeText(String text){
        text = text.toLowerCase();
        text = text.replaceAll("\n",".\n" );
        text = text.replaceAll("\\s+", " ").trim();
        text = text.replaceAll("[^a-zA-Z0-9]*,[^a-zA-Z0-9]*", ", ");
        text = text.replaceAll("\\s+\"(.*?)\"\\s+", "\"$1\"");
        text = text.replaceAll("[^a-zA-Z0-9]*:[^a-zA-Z0-9]*", ": ");
        text = text.replaceAll("[^a-zA-Z0-9]*\\.[^a-zA-Z0-9]*", ".");
        String temp = "";
        String []str = text.split("\\.");
            for (String string : str) {              
                temp += string.substring(0, 1).toUpperCase() + string.substring(1) + ".";
        } 
        text = temp;
        text = text.replaceAll("[^a-zA-Z0-9]*\\.[^a-zA-Z0-9]*", ". ");
        return text;
    }
    

}
