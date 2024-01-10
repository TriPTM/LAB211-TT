
package controller;

import java.util.ArrayList;
import model.Experience;
import model.Fresher;
import model.Internship;

public class CandidateManager {
    private static ArrayList<Experience> e;
    private static ArrayList<Fresher> f;
    private static ArrayList<Internship> i;

    public CandidateManager() {
        e = new ArrayList<>();
        f = new ArrayList<>();
        i = new ArrayList<>();
    }

    
    public ArrayList<Experience> getE() {
        return e;
    }

    public void setE(ArrayList<Experience> e) {
        this.e = e;
    }

    public ArrayList<Fresher> getF() {
        return f;
    }

    public void setF(ArrayList<Fresher> f) {
        this.f = f;
    }

    public ArrayList<Internship> getI() {
        return i;
    }

    public void setI(ArrayList<Internship> i) {
        this.i = i;
    }
    
    public void search(String name, int type) {
        switch (type) {
            case 1:
                for (Experience el : e) {
                    if (name == el.getFName()) {
                        System.out.println(el);
                    }
                }
                break;
            case 2:
                for (Fresher fl : f) {
                    if (fl.getFName().contains(name) || fl.getLName().contains(name)) {
                        System.out.println(fl);
                    }
                }
                break;
            case 3:
                for (Intern il : i) {
                    if (il.getFName().contains(name) || il.getLName().contains(name)) {
                        System.out.println(il);
                    }
                }
                break;
        }
    }
}
