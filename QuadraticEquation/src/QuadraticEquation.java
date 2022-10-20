public class QuadraticEquation {
    double a,b,c;
    public QuadraticEquation(){}
    private QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    public void setA(double a) {
        this.a = a;
    }
    public void setB(double b) {
        this.b = b;
    }
    public void setC(double c) {
        this.c = c;
    }
    public double getDiscriminant(){
        double delta = (this.b*this.b) - 4*this.a*this.c;
        return delta;
    }
    public double getRoot1(){
        double r1 = 0f;
        if (this.getDiscriminant()<0){
            r1 = 0;
            return r1;
        } else if (this.getDiscriminant()>=0) {
            r1 = (-this.b - Math.pow(this.getDiscriminant(), 0.5)) /2*this.a;
            return r1;
        }
        return r1;
    }
    public double getRoot2(){
        double r2 = 0f;
        if (this.getDiscriminant()<0){
            r2 = 0;
            return r2;
        } else if (this.getDiscriminant()>=0) {
            r2 = (-this.b + Math.pow(this.getDiscriminant(), 0.5)) /2*this.a;
            return r2;
        }
        return r2;
    }
    public static void main(String[] args) {
        QuadraticEquation ptb2 = new QuadraticEquation();
        ptb2.setA(1);
        ptb2.setB(2);
        ptb2.setC(3);
        System.out.print("x1 = " + ptb2.getRoot1() + "\n");
        System.out.print("x2 = " + ptb2.getRoot2());
    }
}

