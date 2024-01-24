
package model;

public class Numberic {
    private float num;
    private boolean odd,even,perfectSquare;

    public Numberic() {
    }

    public Numberic(float num) {
        this.num = num;
        this.odd = false;
        this.even = false;
        this.perfectSquare = false;
    }

    public Numberic(float num, boolean odd, boolean even, boolean perfectSquare) {
        this.num = num;
        this.odd = odd;
        this.even = even;
        this.perfectSquare = perfectSquare;
    }

    public float getNum() {
        return num;
    }

    public void setNum(float num) {
        this.num = num;
    }

    public boolean isOdd() {
        return odd;
    }

    public void setOdd(boolean odd) {
        this.odd = odd;
    }

    public boolean isEven() {
        return even;
    }

    public void setEven(boolean even) {
        this.even = even;
    }

    public boolean isPerfectSquare() {
        return perfectSquare;
    }

    public void setPerfectSquare(boolean perfectSquare) {
        this.perfectSquare = perfectSquare;
    }
    
}
