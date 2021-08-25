package Week4.interfacebasic;
import java.lang.Math;

/**
 * Represents a right-angle triangle.
 */
public class Triangle implements Shape
{
    double base;
    double height;

    /** Initialises class variables.
     * @param base the base of the triangle
     * @param height the height of the triangle
     */
    public Triangle(double base, double height)
    {
        this.base = base;
        this.height = height;
    }

    public double calculateArea()
    {
        double Area = 0.5 * base * height;
        return Area;
    }
}
