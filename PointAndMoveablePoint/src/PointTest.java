public class PointTest {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point.toString());

        point = new Point(1.3f,3.6f);
        System.out.println(point.toString());
    }
}
