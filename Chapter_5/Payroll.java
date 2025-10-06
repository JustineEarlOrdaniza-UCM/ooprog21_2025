import java.util.Scanner;

class Payroll
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int empNum;
        double rate;
        int hours;

        System.out.print("Enter employee number >> ");
        empNum = input.nextInt();

        System.out.print("How many hours did you work this week? ");
        hours = input.nextInt();

        System.out.print("What is your regular pay rate? ");
        rate = input.nextDouble();

        Employee emp = new Employee(empNum, rate);

        double regularPay = emp.computeRegularPay(hours);
        double overtimePay = emp.computeOvertimePay(hours);

        System.out.println("Regular pay is " + regularPay);
        System.out.println("Overtime pay is " + overtimePay);
    }
}
