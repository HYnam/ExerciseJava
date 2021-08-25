package Week4.interfacebasic;
import java.lang.Math;

public class Circle implements Shape
{
    double radius;

    /** Initialises class variables.
     * @param radius the radius of the circle
     */
    public Circle(double radius)
    {
        this.radius = radius;
    }

    @Override
    public double calculateArea()
    {
        double Area = Math.PI * Math.pow(this.radius, 2);
        return Area;
    }
}

