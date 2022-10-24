public class CylinderTest {
    public static void main(String[] args) {
        Circle cylinder = new Cylinder();
        System.out.println(cylinder.toString());

        cylinder = new Cylinder(3.3, 5.5, "red");
        System.out.println(cylinder.toString());
    }
}
