public class Employee {
    private int empNumber;
    private double payRate;
    private static final int MAX_EMP_NUMBER = 9999;
    private static final double MAX_RATE = 60.00;
    private static final double OVERTIME_MULTIPLIER = 1.5;

    public Employee(int empNumber, double payRate) {

        if (empNumber > MAX_EMP_NUMBER) {
            empNumber = MAX_EMP_NUMBER;
        }
        this.empNumber = empNumber;

        if (payRate > MAX_RATE) {
            payRate = MAX_RATE;
        }
        this.payRate = payRate;
    }

    public int getEmpNumber() {
        return empNumber;
    }

    public double getPayRate() {
        return payRate;
    }

    public double computeRegularPay(int hoursWorked) {
        double regularPay;
        if (hoursWorked <= 40) {
            regularPay = hoursWorked * payRate;
        } else {
            regularPay = 40 * payRate;
        }
        return regularPay;
    }

    public double computeOvertimePay(int hoursWorked) {
        double overtimePay;
        if (hoursWorked > 40) {
            int overtimeHours = hoursWorked - 40;
            overtimePay = overtimeHours * payRate * OVERTIME_MULTIPLIER;
        } else {
            overtimePay = 0;
        }
        return overtimePay;
    }
}