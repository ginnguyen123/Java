package interface_colorable;

import shape1.Circle;
import shape1.Rectangle;
import shape1.Shape;
import shape1.Square;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] drawing = new Shape[3];
        drawing[0] = new Circle(2);
        drawing[1] = new Rectangle(2,4);
        drawing[2] = new Square(5);
        for (Shape d : drawing){
            if (d instanceof Circle){
                System.out.println(((Circle) d).getArea());
            }
            if (d instanceof Rectangle){
                System.out.println(((Rectangle) d).getArea());
            }
            if (d instanceof Square){
                System.out.println(((Square) d).getArea());
                ((Square) d).howToColor();
            }
        }
    }
}
