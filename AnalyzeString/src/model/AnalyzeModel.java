
package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AnalyzeModel {
    private String input;

    public AnalyzeModel() {
    }

    public AnalyzeModel(String input) {
        this.input = input;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }
    
    public HashMap<String,List<Integer>> getNumber(){
        HashMap<String,List<Integer>> getNumber = new HashMap<String, List<Integer>>();
        String number = input.replaceAll("\\D+", ",");
        if (number.charAt(0) == ',') {
            number = number.substring(1);
        }
        if (number.charAt(number.length() - 1) == ',') {
            number = number.substring(0, number.length() - 1);
        }
        String[] listNumber = number.split(",");
        int lenNumber = listNumber.length;
        
        List<Integer> liPerfectSquare = new ArrayList<>();
        List<Integer> liOdd = new ArrayList<>();
        List<Integer> liEven = new ArrayList<>();
        List<Integer> liAll = new ArrayList<>();
        for (int i = 0; i < lenNumber; i++) {
            int numberCheck = Integer.parseInt(listNumber[i]);
            if (numberCheck % 2 == 1) {
                liOdd.add(numberCheck);
            }
            if (numberCheck % 2 == 0) {
                liEven.add(numberCheck);
            }
            if (checkSquareNumber(numberCheck)) {
                liPerfectSquare.add(numberCheck);
            }
            liAll.add(numberCheck);
        }
        getNumber.put("Perfect Square Numbers: ", liPerfectSquare);
        getNumber.put("Odd Numbers: ", liOdd);
        getNumber.put("Even Numbers: ", liEven);
        getNumber.put("All Numbers: ", liAll);
        return getNumber;
    }
    
    public HashMap<String,StringBuilder> getCharacter(){
        HashMap<String, StringBuilder> getCharacter = new HashMap<String, StringBuilder>();
        StringBuilder uppercase = new StringBuilder(input.replaceAll("\\W|_|[0-9]|[a-z]", ""));
        StringBuilder lowercase = new StringBuilder(input.replaceAll("\\W|_|[0-9]|[A-Z]", ""));
        StringBuilder special = new StringBuilder(input.replaceAll("[0-9]|[a-z]|[A-Z]", ""));
        StringBuilder allCharacter = new StringBuilder(input.replaceAll("[0-9]", ""));

        getCharacter.put("Uppercase: ", uppercase);
        getCharacter.put("Lowercase: ", lowercase);
        getCharacter.put("Special: ", special);
        getCharacter.put("All Character: ", allCharacter);
        return getCharacter;
    }
    
    public boolean checkSquareNumber(int n){
        double sqrt=Math.sqrt(n);   
        return ((sqrt - Math.floor(sqrt)) == 0);   
    }
}
