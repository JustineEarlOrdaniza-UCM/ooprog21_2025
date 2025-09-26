// This class uses a DebugCircle class
// to instantiate a Circle object
import java.util.Scanner;
public class DebugFour1
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int radius;

        // change "Circle c = new Circle();" to "DebugCircle c;"
        DebugCircle c;

        System.out.print("Enter a radius for a circle >> ");
        radius = input.nextInt();

        // change "c = new DebugCircle(c);" to "c = new DebugCircle(radius);"
        c = new DebugCircle(radius);

        // change "getRad()" to "getRadius()"
        System.out.println("The radius is " + c.getRadius());

        // change "getDiam()" to "getDiameter()"
        System.out.println("The diameter is " + c.getDiameter());

        System.out.println("The area is " + c.getArea());
    }
}
