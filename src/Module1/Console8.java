package Module1;

import java.util.Scanner;

public class Console8 {
    static void main(String[] args) {

        System.out.print("hey body");
        System.out.print(", Keeps in the same line");

        System.out.println(", didn't create the new line yet");
        System.out.println("Now created the new line.");

        System.out.printf("The number is: %d %d %d %d", 23, 34, 43, 34);

        Scanner input = new Scanner(System.in);

        System.out.print("\nHow old are you?");
        int age = input.nextInt();
        input.nextLine();

        System.out.print("What is your name?");
        String name = input.next();

        System.out.print("What is your last name?");
        String lastName = input.next();

        System.out.printf("\n \nThe %s %s is %d years old.", name, lastName, age);

        input.close();
    }
}
