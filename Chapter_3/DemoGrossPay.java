class DemoGrossPay {

    public static void main(String[] a) {
        calculateGross(10.0);
        calculateGross(25.0);
        calculateGross(37.5);
    }

    public static void calculateGross(double hours) {
        double hourlyRate = 22.75;
        double grossPay = hours * hourlyRate;
        System.out.println(hours + " hours at $" + hourlyRate + " per hour is $" + grossPay);
    }
}
