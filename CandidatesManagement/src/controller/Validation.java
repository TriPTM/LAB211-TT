
package controller;

import java.util.Scanner;

public class Validation {
    private Scanner sc = new Scanner(System.in);
    
    public int inputNum() {
        try {
            return Integer.parseInt(sc.nextLine());
        } catch (Exception e) {
            return -1;
        }
    }
    
    public String inputString() {
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isLetter(s.charAt(i))) {
                return "";
            }
        }
        return s;
    }
    
    public String madeId(int flag) {
        CandidateManager c = new CandidateManager();
        String id = String.valueOf(flag) + "0";
        switch (flag) {
            case 1:
                id = String.valueOf(Integer.parseInt(id) + c.getE().size());
                break;
            case 2:
                id = String.valueOf(Integer.parseInt(id) + c.getF().size());
                break;
            case 3:
                id = String.valueOf(Integer.parseInt(id) + c.getI().size());
                break;
        } 
        return "C" + id;
    }
    
    public boolean checkPhone(String phone) {
        for (int i = 0; i < phone.length(); i++) {
            if (!Character.isDigit(phone.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    
    public boolean checkRank(String rank) {
        String[] s = {"Excellence", "Good", "Fair", "Poor"};
        
        for (String str : s) {
            if (rank == str) {
                return true;
            }
        }
        return false;
    }
}
