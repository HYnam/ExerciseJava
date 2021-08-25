package Week4.interfacebasic;
import java.lang.Math;

/**
 * Represents a multi-sided shape. Each side is has the same length.
 */
public class Polygon implements Shape
{
    int numberSideOfPolygon;
    double sideLengthOfSides;

    /** Initialises class variables.
     * @param numberSides the number sides the polygon has. e.g. a Hexagon has 6 sides
     * @param sideLength the length of each side (in metres)
     */
    public Polygon(int numberSides, double sideLength)
    {
        this.numberSideOfPolygon = numberSides;
        this.sideLengthOfSides = sideLength;
    }

    public double calculateArea()
    {
        double area;
        area = (Math.pow(this.sideLengthOfSides, 2) * this.numberSideOfPolygon) / (4 * Math.tan(Math.PI / this.numberSideOfPolygon));
        return area;
    }
}

