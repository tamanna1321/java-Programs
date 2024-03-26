import java.util.Scanner;

public class Notes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of denominations:");
        int size = scanner.nextInt();
        int[] denominations = new int[size];

        System.out.println("Enter the denominations:");
        for (int i = 0; i < size; i++) {
            denominations[i] = scanner.nextInt();
        }

        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (denominations[j] > denominations[i]) {
                    int temp = denominations[i];
                    denominations[i] = denominations[j];
                    denominations[j] = temp;
                }
            }
        }

        System.out.println("Enter the amount:");
        int amount = scanner.nextInt();

        int remainingAmount = amount;

        System.out.println("Number of notes:");
        for (int i = 0; i < size; i++) {
            int count = remainingAmount / denominations[i];
            if (count > 0) {
                System.out.println(denominations[i] + " : " + count);
                remainingAmount %= denominations[i];
            }
        }

        if (remainingAmount > 0) {
            
            int smallestDenomination = denominations[size - 1];
            int adjustedAmount = (remainingAmount / smallestDenomination + 1) * smallestDenomination;
            int additionalAmount = adjustedAmount - amount;
            System.out.println("Adjusted remaining amount to the smallest denomination: " + adjustedAmount);
            System.out.println("Add " + additionalAmount + " to round off to the smallest denomination.");
            
            
            
        }
    }
}