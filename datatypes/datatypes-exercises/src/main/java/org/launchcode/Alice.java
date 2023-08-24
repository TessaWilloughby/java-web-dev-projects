package org.launchcode;

import java.util.Scanner;
public class Alice {
    public static void main(String[] args) {
        String aliceText = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’";

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a search term: ");
        String searchTerm = input.nextLine().toLowerCase();

        boolean found = aliceText.toLowerCase().contains(searchTerm);

        if (found) {
            int index=aliceText.toLowerCase().indexOf(searchTerm);
            int length = searchTerm.length();

            System.out.println("Search term found at index: " + index);
            System.out.println("Search term length: " + length);

            String updatedAliceText = aliceText.substring(0, index) + aliceText.substring(index + length);

            System.out.println("Updated sentence: " + updatedAliceText);

        } else {
            System.out.println("Search term not found.");
        }
        input.close();
    }
}
