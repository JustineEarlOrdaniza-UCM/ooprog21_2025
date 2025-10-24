import java.util.Scanner;

class BankBalance 
{
    static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
            double balance, rate;
            int year = 1;
            int response;

            System.out.print("Enter initial balance >> ");
            balance = input.nextDouble();

            System.out.print("Enter annual interest rate (as a decimal, e.g., 0.03 for 3%) >> ");
            rate = input.nextDouble();

        do 
        {
            balance = balance + (balance * rate);
            System.out.printf("After year %d at %.2f interest rate, balance is $%.4f%n", year, rate, balance);

            System.out.println();
            System.out.println("Do you want to see the balance at the end of another year?");
            System.out.print("Enter 1 for yes\n or any other number for no >> ");
            response = input.nextInt();
            year++;
        } 
        while (response == 1);
    }
}