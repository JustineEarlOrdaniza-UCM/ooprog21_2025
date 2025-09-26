// This class uses a DebugBox class
// to instantiate two Box objects
import java.util.Scanner;
public class DebugFour3
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int w, l, h;

        System.out.print("Enter width of box >> ");
        // change "input.nextInteger();" to "input.nextInt();"
        w = input.nextInt();

        System.out.print("Enter length of box >> ");
        // change "input.nextDouble();" to "input.nextInt();"
        l = input.nextInt();

        System.out.print("Enter height of box >> ");
        h = input.nextInt();

        // change "FixDebugBox" to "DebugBox"
        // change duplicate "box1" to "box2"
        DebugBox box1 = new DebugBox();
        DebugBox box2 = new DebugBox(w, l, h);

        System.out.println("The dimensions of the first box are");
        box1.showData();
        System.out.print(" The volume of the first box is ");
        showVolume(box1);

        System.out.println("The dimensions of the second box are");
        box2.showData();
        System.out.print(" The volume of the second box is ");

        // change "box2.showVolume();" to "showVolume(box2);"
        showVolume(box2);
    }

    public static void showVolume(DebugBox aBox)
    {
        double vol = aBox.getVolume();
        System.out.println(vol);
    }
}
