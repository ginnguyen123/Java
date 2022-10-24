public class MoveablePointTest {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.println(moveablePoint.toString());

        moveablePoint = new MoveablePoint(3.4f,4.5f,5.5f,6.6f);
        System.out.println(moveablePoint.toString());

        moveablePoint = new MoveablePoint(2.3f,7.9f);
        System.out.println(moveablePoint.toString());
    }
}
