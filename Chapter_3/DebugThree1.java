import java.util.Scanner;

public class DebugThree1 {
    public static void main(String[] args) {
        // Declare variables to store the amounts for two checks
        double check1;
        double check2;
        
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);
        
        // Ask the user to enter the amount for the first check
        System.out.print("Enter the amount of your check >> ");
        check1 = input.nextDouble();  // Read the first check amount as a double
        
        // Ask the user to enter the amount for the second check
        System.out.print("Enter the amount of your friend's check >> ");
        check2 = input.nextDouble();  // Read the second check amount as a double

        // Calculate and display the tip for both checks
        calcTip(check1);
        calcTip(check2);
    }

    // Method to calculate the tip based on the amount of the bill
    public static void calcTip(double bill) {
        final double RATE = 0.15;  // Tip is 15% of the bill
        
        // Calculate the tip by multiplying the bill amount by the tip rate
        double tip = bill * RATE;
        
        // Display the calculated tip
        System.out.println("The tip should be at least $" + tip);
    }
}
