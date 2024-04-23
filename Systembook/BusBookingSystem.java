package Systembook;

import java.util.Scanner;

public class BusBookingSystem {
    private static final int TOTAL_SEATS = 46;
    private static boolean[] seats = new boolean[TOTAL_SEATS];
    private static Customer[] customers = new Customer[TOTAL_SEATS];
    private static double[] prices = new double[TOTAL_SEATS];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("Welcome to the Bus Booking System");
            System.out.println("1. Show available seats..");
            System.out.println("2. Book a seat");
            System.out.println("3. Exit");
            System.out.println("Please enter your choice: ");
            option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    showSeatDetails();
                    break;
                case 2:
                    bookseat(scanner);
                    break;
                case 3:
                    System.out.println("thankyou for using our services");
                    break;
                default:
                    System.out.println("Invalid option,please choose again");
            }
        } while (option != 3);
        scanner.close();
    }

    private static void showSeatDetails() {
        System.out.println("Seat Details: ");
        for (int i = 0; i < TOTAL_SEATS; i++) {
            System.out.print("Seat" + (i + 1) + ":");
            if (seats[i] && customers[i] != null) {
                System.out.println(
                        "Booked by" + customers[i].getName() + ",Phone: " + customers[i].getPhoneNumber()
                                + ",Price:$" + String.format("%.2f", prices[i]));
            } else {
                System.out.println("Available");
            }
        }
    }

    private static void bookseat(Scanner scanner) {
        showSeatDetails();
        System.out.println("select a seat number to book: ");
        int seatNumber = scanner.nextInt();
        scanner.nextLine();
        if (seatNumber < 1 || seatNumber > TOTAL_SEATS || seats[seatNumber - 1]) {
            System.out.println("invalid seat number or seat is already book.Please try again..");
            return;
        }
        System.out.println("Enter your name :");
        String name = scanner.nextLine();
        System.out.println("Enter your phone number :");
        String phoneNumber = scanner.nextLine();
        double price = Pricing.calculatePrice(seatNumber);
        seats[seatNumber - 1] = true;
        customers[seatNumber - 1] = new Customer(name, phoneNumber);
        prices[seatNumber - 1] = price;
        System.out.println("seats" + seatNumber + "has been successfully booked by " + name + ".");
        System.out.printf("total price for the seat is : $%.2f\n", price);
        System.out.println("contact number : " + phoneNumber);
    }

}
