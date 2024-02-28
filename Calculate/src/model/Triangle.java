
package model;

public class Triangle extends Shape{
    private double a,b,c;

    public Triangle() {
    }

    public Triangle(double a, double b, double c) {
        if(!checkPossiable(a,b,c)) throw new RuntimeException("Data initialization failed - unreasonable data");   
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        if(!checkPossiable(a,b,c)) throw new RuntimeException("Data setup failed - unreasonable data");
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        if(!checkPossiable(a,b,c)) throw new RuntimeException("Data setup failed - unreasonable data");
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        if(!checkPossiable(a,b,c)) throw new RuntimeException("Data setup failed - unreasonable data");
        this.c = c;
    }
    
    public double getArea(){
        double p = getPerimeter()/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    
    public double getPerimeter(){
        return a+b+c;
    }

    @Override
    public void printResult() {
        System.out.println("-----Triangle-----");
        System.out.println("Side A: " + this.a);
        System.out.println("Side B: " + this.b);
        System.out.println("Side C: " + this.c);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
    
    public boolean checkPossiable(double a, double b, double c){
        if(a == 0 || b == 0 || c == 0) return true;
        return ((a + b > c) && (a + c >b) && (b + c > a));
    }
}
