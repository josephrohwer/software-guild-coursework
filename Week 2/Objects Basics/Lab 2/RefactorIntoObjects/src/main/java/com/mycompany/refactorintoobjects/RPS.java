/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.refactorintoobjects;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class RPS {

    public static void runProgram() {
        Scanner kb = new Scanner(System.in);

        int userWin = 0;
        int computerWin = 0;
        int tie = 0;
        int rounds;
        int replay;
        int userChoice;

        do {
            do {
                System.out.println("How many rounds would you like to play? ");
                rounds = kb.nextInt();
            } while (rounds > 10 || rounds < 1);

            for (int i = 0; i < rounds; i++) {
                System.out.println("Please choose one");
                System.out.println("1. Rock 2. Paper. 3. Scissors");
                userChoice = kb.nextInt();
                int computerChoice = (int) (Math.random() * 3) + 1;

                if (computerChoice == 1 && userChoice == 2) {
                    System.out.println("user win\n");
                    userWin++;
                }
                if (computerChoice == 1 && userChoice == 3) {
                    System.out.println("computer win\n");
                    computerWin++;
                }
                if (computerChoice == 1 && userChoice == 1) {
                    System.out.println("tie\n");
                    tie++;
                }
                if (computerChoice == 2 && userChoice == 3) {
                    System.out.println("user win\n");
                    userWin++;
                }
                if (computerChoice == 2 && userChoice == 1) {
                    System.out.println("computer win\n");
                    computerWin++;
                }
                if (computerChoice == 2 && userChoice == 2) {
                    System.out.println("tie\n");
                    tie++;
                }
                if (computerChoice == 3 && userChoice == 1) {
                    System.out.println("user win\n");
                    userWin++;
                }
                if (computerChoice == 3 && userChoice == 2) {
                    System.out.println("computer win\n");
                    computerWin++;
                }
                if (computerChoice == 3 && userChoice == 3) {
                    System.out.println("tie\n");
                    tie++;
                }
            }

            System.out.println("You won " + userWin + " times, lost " + computerWin + " times, and tied " + tie + " times.\n");

            if (userWin > computerWin) {
                System.out.println("Overall, you won!\n");
            } else if (userWin < computerWin) {
                System.out.println("Overall, you lost!\n");
            } else {
                System.out.println("Overall, you both did the same!\n");
            }

            userWin = 0;
            computerWin = 0;
            tie = 0;

            System.out.println("Would you like to play again? Enter 1 for yes and 2 for no.");
            replay = kb.nextInt();

            if (replay == 1) {
                //go back to start
            } else {
                System.out.println("Thanks for playing!");
            }
        } while (replay == 1);
    }
}
