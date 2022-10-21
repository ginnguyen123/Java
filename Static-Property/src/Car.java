public class Car {
    private String name;
    private String engine;
    public static int numbersOfCar;
    public Car(){};
    public Car(String name, String engine){
        this.name = name;
        this.engine = engine;
        numbersOfCar++;
    }
}
