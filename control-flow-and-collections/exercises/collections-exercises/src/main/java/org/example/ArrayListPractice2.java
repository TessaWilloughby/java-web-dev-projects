package org.example;

import java.util.List;

public class ArrayListPractice2 {

    public static void printWordsWithFiveLetters(List<String> words) {
        for (String word : words) {
            if (word.length() == 5) {
                System.out.println(word);
            }
        }
    }

    public static void main(String[] args) {
        List<String> wordList = List.of("apple", "banana", "grape", "melon", "kiwi", "pear");
        printWordsWithFiveLetters(wordList);
    }
}
