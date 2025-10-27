import java.util.Scanner;

class BankBalanceByRateAndYear
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        double balance;

        System.out.print("Enter initial bank balance > ");
        balance = input.nextDouble();
 
        double[] rates1 = {0.02, 0.03};
        for (double rate : rates1) 
        {
            double newBalance = balance;
            System.out.println();
            System.out.println("With an initial balance of $" + balance + " at an interest rate of " + rate);
            for (int year = 1; year <= 4; year++) 
            {
                newBalance = newBalance + (newBalance * rate);
                System.out.println("After year " + year + " balance is $" + newBalance);
            }
            System.out.println();
        }

        double[] rates2 = {0.04, 0.05};
        for (double rate : rates2) 
        {
            double newBalance = balance;
            System.out.println();
            System.out.println("With an initial balance of $" + balance + " at an interest rate of " + rate);
            for (int year = 1; year <= 4; year++) 
            {
                newBalance = newBalance + (newBalance * rate);
                System.out.println("After year " + year + " balance is $" + newBalance);
            }
            System.out.println();
        }

        input.close();
    }
}
