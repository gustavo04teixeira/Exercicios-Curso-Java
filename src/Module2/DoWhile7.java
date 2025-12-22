package Module2;

import java.util.Scanner;

public class DoWhile7 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String word = "please";

        do {
            System.out.print("Type the magics words: ");
            word = input.nextLine();
        }while(!word.equalsIgnoreCase("please"));{
            System.out.print("ok, no problem");
        }

        input.close();
    }
}
