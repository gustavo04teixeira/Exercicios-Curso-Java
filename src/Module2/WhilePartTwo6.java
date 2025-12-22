package Module2;

import java.util.Scanner;

public class WhilePartTwo6 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String word = "";

        while (!word.equalsIgnoreCase("exit")){
            System.out.print("Did you say? ");
            word = input.nextLine();
        }
        input.close();
    }
}
