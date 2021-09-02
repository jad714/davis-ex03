/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Davis
 */

import java.util.Scanner;

public class Solution03 {
    /* Begin pseudocode */
    // Create scanner object.
    // Create variables for storing two strings (quote and attribution).
    // Prompt the user for quote.
    // Prompt the user for attribution.
    // Print statement (one line) of quote.
    /* End pseudocode */

    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        String quote;
        String attribution;
        System.out.print("What is the quote? ");
        quote = userInput.nextLine();
        System.out.print("\nWho said it? ");
        attribution = userInput.nextLine();
        System.out.println(attribution + " says, \"" + quote + "\"");
    }
}
