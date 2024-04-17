package assignment;

import java.util.Scanner;

public class abbrevationfull

{
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name");
        String name = sc.nextLine();
        String word = "";
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch != ' ') {
                word = word + ch;
            } else {
                System.out.print(word.charAt(0) + ".");
                word = "";
            }
        }
        System.out.print(word);
    }
}