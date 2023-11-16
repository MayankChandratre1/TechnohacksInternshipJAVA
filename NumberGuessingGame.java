package Technohack;

//Number guessing game in Java
//Technohacks Edutech internship task#2

import java.util.*;

public class NumberGuessingGame {
  public static void main(String[] args) {
    int tries = 0, num, chosenNum = 0;
    Random rn = new Random();
    Scanner sc = new Scanner(System.in);

    System.out.println("\n\t\t### Welcome to the Number Guessing Game ###\t\t\n");
    System.out.println("Guess A number between 1 and 100");

    num = rn.nextInt(100) + 1; // Selecting a number between 1 to 100.

    while (true) {
      System.out.print("Enter your guess: ");
      chosenNum = sc.nextInt();
      tries++; // Incrementing tries everytime a user guesses.
      if (chosenNum == num) {
        System.out.println("You guessed the right number in " + tries + " tries.");
        sc.close();
        break;
      } else if (chosenNum < num) {
        System.out.println("Too Low, try again.\n");
      } else {
        System.out.println("Too High, try again.\n");
      }
    }
  }
}