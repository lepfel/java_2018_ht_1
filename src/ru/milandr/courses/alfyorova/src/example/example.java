package example;
import hometask1.Elephant;
import hometask2.Coordinates;

public class example {
    public static void main(String[] args) {
        Elephant elephant = new Elephant("Vasya", 58, 10);
        elephant.printElephant();
        elephant.eat();
        elephant.printElephant();
        elephant.setName("Valiliy");
        elephant.printElephant();

        System.out.print("------\n");

        Coordinates coordinates = new Coordinates(-3, -3);
        System.out.printf("Distance between (-1, -1): %.3f%n", coordinates.getDistance(-1, -1));

        System.out.println("Line: " + coordinates.getInclinationOfLine(2,2)
                                    + "x + " + coordinates.getFreeOfLine(2, 2) );

        Coordinates mid_coor = coordinates.getMiddle(2, 2);
        System.out.println("X mid : " + mid_coor.getX() + ", Y mid :" + mid_coor.getY());

        Coordinates center = coordinates.centerOfCircle(2, 2);
        System.out.print("The equation of circle: (x - " +  center.getX() + " )^2  + "
                                                         + "( y - " + center.getY() + ")^2 = ");
        System.out.printf("%.3f ^2%n", coordinates.radiusOfCircle(2, 2));
    }
}