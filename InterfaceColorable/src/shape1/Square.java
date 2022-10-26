package shape1;

import interface_colorable.Colorable;

public class Square extends Rectangle implements Colorable {
    //private double side;
    public Square(){};
    public Square(double side){
        super(side, side);
        //this.side = side;
    }
    public Square(double side, String color, boolean filled){
        super(side, side);
        setColor(color);
        setFilled(filled);
    }
    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        setLength(side);
        setWidth(side);
    }
    public double getArea(){
        return getWidth()*getLength();
    }
    @Override
    public String toString(){
        return  "A shape1.Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four side!");
    }
}
