public class Square extends Rectangle {
    public Square(){};
    public Square(double side){
        super(side, side);
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
    @Override
    public String toString(){
        return  "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
}
