package example;
import hometask1.Elephant;
import hometask2.Decart;

public class fmain {
    public static void main(String[] args) {
        Elephant elephant = new Elephant("Vasya", 58);
        elephant.printElephant();
        elephant.eat();
        elephant.printElephant();

        Decart decart = new Decart(1, 1);
        System.out.printf("Distance between (-1, -1): %.3f%n", decart.getDistance(-1, -1));
        System.out.println("Line: " + decart.getInclinationOfLine(2,2) + "x + " + decart.getFreeOfLine(2, 2) );
        Decart mid_dec = decart.getMiddle(2, 2);
        System.out.println("X mid : " + mid_dec.getX() + ", Y mid :" + mid_dec.getY());
    }
}