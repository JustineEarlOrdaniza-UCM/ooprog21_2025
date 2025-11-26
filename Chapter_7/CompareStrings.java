import java.util.Scanner;

class CompareStrings 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        String predefined = "Carmen";

        System.out.print("Enter your name > ");
        String input = sc.nextLine();

        if (input.equals(predefined)) 
        {
            System.out.println(predefined + " equals " + input);
        }
        else 
        {
            System.out.println(predefined + " does not equal " + input);
        }

        sc.close();
    }
}

