import java.sql.Array;

public class MylistTest {
    public static void main(String[] args) {
        Mylist testList = new Mylist<>();
        //testList.ensureCapacity(1);
        System.out.println(testList.getSize());
        testList.add(0, "Trung");
        testList.add(1, "Nghia");
        testList.add(2, new Circle(2));


    }
}
