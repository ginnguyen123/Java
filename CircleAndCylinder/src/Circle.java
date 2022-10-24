public class Circle {
    private double radius;
    private String color;
    public Circle(){};
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }
    @Override
    public String toString(){
        return "Circle has a color " + getColor() + ", with the radius is a "+getRadius()+ " the circle area is " +getArea();
    }
}
