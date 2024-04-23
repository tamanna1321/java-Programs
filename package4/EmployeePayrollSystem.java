package package4;

    public class EmployeePayrollSystem {
        public static void main(String[] args) {
            Hourly hourlyEmployee = new Hourly(" rohan ", " 123456 ", 20.0);
            hourlyEmployee.setPayPeriodDetails();
            System.out.println(hourlyEmployee);
            Commission commissionEmployee = new Commission(" john  ", " 987654 ", 7.5);
            commissionEmployee.setPayPeriodDetails();
            System.out.println(commissionEmployee);
        }
    }
    

