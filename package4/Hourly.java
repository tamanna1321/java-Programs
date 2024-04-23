package package4;
    
import java.util.Scanner;

public class Hourly extends Employee implements Payroll {
    private double hourlyRate;
    private int hourWorkedWeek1;
    private int hourWorkedWeek2;

    public Hourly(String name, String number, double hourlyRate) {
        super(name, number); 
        this.hourlyRate = hourlyRate;
    }

    @Override
    public void setPayPeriodDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the hours worked for first week:");
        hourWorkedWeek1 = scanner.nextInt();
        System.out.println("Enter the hour worked for second week:");
        hourWorkedWeek2 = scanner.nextInt();
    }

    @Override
    public double calculatePay() {
        return calculateWeeklyPay(hourWorkedWeek1) + calculateWeeklyPay(hourWorkedWeek2);
    }

    private double calculateWeeklyPay(int hours) {
        if (hours > 40) {
            return 40 * hourlyRate + (hours - 40) * hourlyRate * 1.5;
        } else {
            return hours * hourlyRate;
        }
    }

    public String toString() {
        return super.toString() + "[Hourly] - pay for period:$" + calculatePay();
    }
}
    

