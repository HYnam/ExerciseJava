package Prac3;

public class Line {
    private Point start;
    private Point end;
    private double length;

    public static double lineLength(Point start, Point end) {
        return Math.sqrt(Math.pow(end.getX() - start.getX(), 2)
                + Math.pow(end.getY() - start.getY(), 2));
    }

    public Line() {
        this.start = new Point();
        this.end = new Point();
        this.length = 0;
    }

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
        this.length = lineLength(start, end);
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }

    public double getLength() {
        return length;
    }

    public void moveStart(float deltaX, float deltaY) {
        start.movePoint(deltaX, deltaY);
        length = lineLength(start, end);
    }

    public void moveEnd(float deltaX, float deltaY) {
        end.movePoint(deltaX, deltaY);
        length = lineLength(start, end);
    }
}
