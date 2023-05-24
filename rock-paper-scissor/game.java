/*
 * main file
 */
import java.util.Random;
import java.util.Scanner;

public class game {
    static void game() {

        int us = 0;
        int cs = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("********Enter 1 for rock, 2 for paper, 3 for Scissor********");

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter your choice--> ");
            int userInput = sc.nextInt();

            // computer input
            Random ra = new Random();
            int computerInput = ra.nextInt(1, 4);

            // display user input
            if (userInput == 1) {
                System.out.println("User: Rock");
            } else if (userInput == 2) {
                System.out.println("User: Paper");
            } else if (userInput == 3) {
                System.out.println("User: Scissor");
            } else {
                System.out.println("!!!Invalid User Input!!!");
                break;
            }

            // display computer input
            if (computerInput == 1) {
                System.out.println("Computer: Rock");
            } else if (computerInput == 2) {
                System.out.println("Computer: Paper");
            } else if (computerInput == 3) {
                System.out.println("Computer: Scissor");
            }

            // Checking

            if (userInput == computerInput) {

            } else if (userInput == 1 && computerInput == 3 || userInput == 2 && computerInput == 1
                    || userInput == 3 && computerInput == 2) {
                us = us + 5;
            } else if (userInput == 3 && computerInput == 1 || userInput == 1 && computerInput == 2
                    || userInput == 2 && computerInput == 3) {
                cs = cs + 5;
            }
        }

        // Displaying result
        if (us > cs) {
            System.out.println("Usre Score: " + us);
            System.out.println("Computer Score: " + cs);
            System.out.println("!!Congratulation!! You win");

        } else if (cs > us) {
            System.out.println("Usre Score: " + us);
            System.out.println("Computer Score: " + cs);
            System.out.println("Computer win");
        } else if (cs == us) {
            System.out.println("Usre Score: " + us);
            System.out.println("Computer Score: " + cs);
            System.out.println("Match Draw. Better luck next time");
        }
    }
}
