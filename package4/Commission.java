package package4;

import java.util.Scanner;

public class Commission extends Employee implements Payroll {
    private double commissionRate;
    private double sales;

    public Commission(String name, String number, double commissionRate) {
        super(name, number);
        this.commissionRate = commissionRate;
    }

    @Override
    public void setPayPeriodDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sales for the pay period:");
        sales = scanner.nextDouble();
    }

    @Override
    public double calculatePay() {
        return sales * (commissionRate / 100.0);
    }

    public String toString() {
        return super.toString() + "[Commission] - pay for period :$" + calculatePay();
    }
}