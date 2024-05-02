package enumpackage;

import java.util.Scanner;

public class EnumImplementation {
    public static void main(String[] args) {
        int dayOfWeek;
        System.out.println("Enter the day in number, 0 - Sunday");
        Scanner scanner = new Scanner(System.in);
        dayOfWeek = scanner.nextInt();
        // EnumClass enumClass = EnumClass.Monday;
        // System.out.println("EnumClass.Monday.ordinal() " +
        // EnumClass.Monday.ordinal());

        for (EnumClass enumValues : EnumClass.values()) {
            if (dayOfWeek == enumValues.ordinal()) {
                System.out.println("Today " + enumValues);
            }
        }

    }
}