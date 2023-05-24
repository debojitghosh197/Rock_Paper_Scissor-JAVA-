/**
 * Author==> DEBOJIT GHOSH
 * CONTENT==> ROCK_PAPER_SCISSOR_GAME
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Rock, paper & scissor game");
        System.out.println("************************************");

        while (i < 10) {
            System.out.print("Press 's' to start: ");
            char cc = sc.next().charAt(0);

            if (cc == 's' || cc == 'S') {
                game.game();
                System.out.println("DO YOU WANT TO PLAY AGAIN: y/n ??");
                char Xx = sc.next().charAt(0);

                if (Xx == 'y' || Xx == 'Y') {
                    game.game();
                } else {
                    System.out.println("😊😊Thanks for playing😊😊");
                    break;
                }
            }
        }

    }
}