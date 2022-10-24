public class Cylinder extends Circle {
    private double height;
    public Cylinder(){};
    public Cylinder(double height){
        this.height = height;
    }
    public Cylinder(double height, double radius, String color){
        super(radius,color);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return getArea()*this.height;
    }
    @Override
    public String toString(){
        return "Cylinder has a heigt " + getHeight() + " and volume: " +getVolume() + " with " + super.toString();
    }
}
