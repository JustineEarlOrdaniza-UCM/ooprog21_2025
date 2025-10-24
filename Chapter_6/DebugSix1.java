// Start with a penny
// Double it every day
// How much do you have in x number of days?
import java.util.Scanner;

public class DebugSix1 {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        int days;
        double money = 0.01;
        int day = 1;

        System.out.print("Enter number of days >> "); // Added missing semicolon here
        days = keyboard.nextInt();

        // Changed condition from (days < day) to (day <= days)
        while(day <= days) {
            System.out.println("After day " + day +
                    " you have " + money);
            money = 2 * money;
            ++day;
        }
    }
}