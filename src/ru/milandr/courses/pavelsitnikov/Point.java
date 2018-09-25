package ru.milandr.courses.pavelsitnikov;

public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getDistanceTo(Point b) {
        return Math.sqrt(Math.pow(this.getX() - b.getX(), 2) + Math.pow(this.getY() - b.getY(), 2));
    }

    public static String getLineEquation(Point a, Point b) {
        if (a.getX() == b.getX() && a.getY() == b.getY()) {
            return "нельзя построить прямую";
        }
        double dx = b.getX() - a.getX();
        double dy = b.getY() - a.getY();
        if (dx == 0) {
            return String.format("x=%.2f", a.getX());
        } else if (dy == 0) {
            return String.format("y=%.2f", a.getY());
        }
        double k = dy / dx;
        double c = a.getY() - k * a.getX();
        return String.format("y=%.2f * x + %.2f", k, c);
    }

    public Point getMiddlePoint(Point b) {
        return new Point((this.getX() + b.getX()) / 2, (this.getY() + b.getY()) / 2);
    }


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

}
