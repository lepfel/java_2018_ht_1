package example;
import hometask1.Elephant;

public class main {
    public static void main() {
        Elephant elephant = new Elephant("Vasya", 58);
        elephant.printElephant();
        elephant.eat();
        elephant.printElephant();
    }
}