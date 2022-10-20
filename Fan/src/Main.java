public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOnOff(true);
        fan2.setSpeed(fan2.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor(fan2.getColor());
        fan2.setOnOff(false);
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
