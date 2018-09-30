package hometask2;

public class Decart {
    private float x;
    private float y;

    public Decart() {
        this.x = 0;
        this.y = 0;
    }

    public Decart(float x, float y) {
        this.x = x;
        this.y = y;
        System.out.println("Point with coordinates X : " + this.x + ", Y: " + this.y + " has created");
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public double getDistance(float x1, float y1) {
        return Math.sqrt((this.x - x1) * (this.x - x1) +
                (this.y - y1) * (this.y - y1));
    }

    public float getInclinationOfLine(float x, float y) {
        return (this.x - x)/(this.y - y);
    }

    public float getFreeOfLine(float x, float y) {
        return (this.y - getInclinationOfLine(x, y) * this.x);
    }

    public Decart getMiddle(float x, float y) {
        float mid_x = (this.x + x) / 2;
        float mid_y = (this.y + y) / 2;
        return new Decart(mid_x, mid_y);
    }

    public double radiusOfCircle(float x, float y) {
        return getDistance(x, y) / 2;
    }

    public Decart centerOfCircle(float x, float y) {
        return getMiddle(x, y);
    }
}

