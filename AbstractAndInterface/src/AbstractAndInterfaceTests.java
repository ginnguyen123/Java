import animal.Chicken;
import animal.Tiger;
import animal.Animal;
import edible.Edible;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Chicken();
        animals[1] = new Tiger();
        for (Animal a : animals){
            System.out.println(a.makeSoul());
            if (a instanceof Chicken){
                Edible edible = (Chicken)a;
                System.out.println(edible.howToEat());
            }
        }

    }
}
