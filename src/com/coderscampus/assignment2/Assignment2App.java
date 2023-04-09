package com.coderscampus.assignment2;

import java.util.Random;
import java.util.Scanner;

public class Assignment2App {

	public static void main(String[] args) {
		  Random random = new Random();
	        int randomNumber = random.nextInt(100) + 1; // generates a random number between 1 and 100 (inclusive)
	        
	        int guessesLeft = 5; // the player has 5 guesses
	        
	        Scanner scanner = new Scanner(System.in);
	        
	        while (guessesLeft > 0) {
	            System.out.print("Pick a number between 1 and 100: ");
	            int guess = scanner.nextInt();
	            
	            if (guess < 1 || guess > 100) {
	                System.out.println("Your guess is not between 1 and 100, please try again");
	                continue; // restart the loop without counting this guess
	            }
	            
	            if (guess < randomNumber) {
	                System.out.println("Please pick a higher number");
	            } else if (guess > randomNumber) {
	                System.out.println("Please pick a lower number");
	            } else {
	                System.out.println("You win!");
	                return; // exit the program
	            }
	            
	            guessesLeft--;
	        }
	        
	        System.out.println("You lose, the number to guess was " + randomNumber);

	}
}