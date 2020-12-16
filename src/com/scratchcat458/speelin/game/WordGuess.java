package com.scratchcat458.speelin.game;

import com.scratchcat458.speelin.list.WordList;

import java.util.Scanner;

import static com.scratchcat458.util.Utils.randomiseString;

public class WordGuess {
    private WordList list;

    public WordGuess(WordList list) {
        this.list = list;
    }

    public void startList() {
        System.out.println("Mode: Word Guess");
        System.out.println("List Name: " + list.getName());
        System.out.println("List Author: " + list.getAuthor());
        System.out.println("Word Count: " + list.getSize());
        System.out.println(" ");
        for (String word : list.getWords()) {
            String[] rc = word.split("");
            randomiseString(rc, rc.length);

            for (String s : rc) {
                System.out.print(s + " ");
            }
            System.out.println(" Input: ");

            Scanner i = new Scanner(System.in);
            boolean b = true;
            while(b) {
                String n = i.nextLine();
                if(n.equalsIgnoreCase(word)) {
                    System.out.println("Task completed. The word was " + word + ".");
                    b = false;
                }
                else {
                    System.out.println("Incorrect Word. Try again");
                }
                if(b) {
                    for (String s : rc) {
                        System.out.print(s + " ");
                    }
                    System.out.println(" Input: ");
                }
            }
        }
        System.out.println("List completed.");
    }
}
