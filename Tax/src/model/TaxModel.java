
package model;

import library.Validation;

public class TaxModel {
    private double income;
    private boolean hasParentsOver60;
    private int siblings;
    private int childrens;
    private boolean under18;
    private boolean study;
    private Validation val = new Validation();

    public TaxModel() {
    }

    public TaxModel(double income, boolean hasParentsOver60, int siblings, int childrens, boolean under18, boolean study) {
        this.income = income;
        this.hasParentsOver60 = hasParentsOver60;
        this.siblings = siblings;
        this.childrens = childrens;
        this.under18 = under18;
        this.study = study;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = val.checkDouble(income);
    }

    public boolean isHasParentsOver60() {
        return hasParentsOver60;
    }

    public void setHasParentsOver60(String hasParentsOver60) {
        this.hasParentsOver60 = val.checkInfo(hasParentsOver60);
    }

    public int getSiblings() {
        return siblings;
    }

    public void setSiblings(String siblings) {
        this.siblings = val.checkInt(siblings);
    }

    public int getChildrens() {
        return childrens;
    }

    public void setChildrens(String childrens) {
        this.childrens = val.checkInt(childrens);
    }

    public boolean isUnder18() {
        return under18;
    }

    public void setUnder18(String under18) {
        this.under18 = val.checkInfo(under18);
    }

    public boolean isStudy() {
        return study;
    }

    public void setStudy(String study) {
        this.study = val.checkInfo(study);
    }
    
}
