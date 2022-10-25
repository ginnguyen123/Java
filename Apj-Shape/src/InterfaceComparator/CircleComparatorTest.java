package InterfaceComparator;

import Shape.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[2] = new Circle();
        circles[1] = new Circle(3.6f);
        circles[0] = new Circle(4.4f,"yellow", false);
        for (Circle a : circles){
            System.out.println(a);
        }
        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);
        for (Circle c : circles){
            System.out.println(c);
        }
    }
}
