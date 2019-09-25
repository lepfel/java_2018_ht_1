package ru.milandr.courses.pavlyuk;

public class Points {
    private double x;
    private double y;

    public Points(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public double distance(Points point) {
        double sqrDistance = Math.pow((this.x - point.x), 2) + Math.pow((this.y - point.y), 2);
        return Math.sqrt(sqrDistance);
    }

    //Уравнение вида y = kx + b
    public void line(Points point) {
        if ((this.x - point.x) == 0) {
            System.out.println("error");
            return;
        }

        double k = (this.y - point.y) / (this.x - point.x);
        double b = this.y - k * this.x;
        System.out.println("y=" + k + "x+" + b);
    }

    public Points middlePoint(Points point) {
        return new Points(averageX(point), averageY(point));
    }

    public void circle(Points point) {
        double xCenter = this.averageX(point);
        double yCenter = this.averageY(point);
        double rad = this.distance(point) / 2;
        System.out.println("(x-" + xCenter + ")^2+(y-" + yCenter + ")^2 = " + Math.pow(rad, 2));

    }

    private double averageX(Points point) {
        return Math.abs(point.x - this.x) / 2 + Math.min(point.x, this.x);
    }

    private double averageY(Points point) {
        return Math.abs(point.y - this.y) / 2 + Math.min(point.y, this.y) / 2;
    }

    @Override
    public String toString() {
        return "Points{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}