package Prac3;

public class Point {

    private float x;
    private float y;

    public Point (float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this.x = 0;
        this.y = 0;
        // this(0, 0); Call constructor form our class and make x = 0, y = 0
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public Point movePoint(float deltaX, float deltaY) {
        float newX = this.x + deltaX;
        float newY = this.y + deltaY;

        Point newPoint = new Point(newX, newY);
        return newPoint;

        // return new Point(this.x + deltaX, this.y + deltaY);
    }

    public Line createLine(Point end) {
        return new Line(this, end);
    }

    public Point flipPoint() {
        return new Point(x * -1, y * -1);
    }


}
