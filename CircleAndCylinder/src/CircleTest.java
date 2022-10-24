public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.toString());

        circle = new Circle(3.3);
        System.out.println(circle.toString());

        circle = new Circle(4.4, "blue");
        System.out.println(circle.toString());
    }
}
