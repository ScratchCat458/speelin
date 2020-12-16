package com.scratchcat458.speelin.game;

import com.scratchcat458.speelin.list.WordList;
import com.scratchcat458.util.Utils;

import java.util.Scanner;

public class WordShuffle {
    private WordList list;

    public WordShuffle(WordList list) {
        this.list = list;
    }

    public void startList() {
        System.out.println("List Name: " + list.getName());
        System.out.println("List Author: " + list.getAuthor());
        System.out.println("Word Count: " + list.getSize());
        System.out.println(" ");
        for (String word : list.getWords()) {
            String[] c = word.split("");
            String[] rc = word.split("");
            Utils.randomiseString(rc, rc.length);

            for (String s : rc) {
                System.out.print(s + " ");
            }
            System.out.println(" Input: ");

            Scanner i = new Scanner(System.in);
            while(!(rc.length == 0)) {
                String n = i.nextLine();
                if(n.equalsIgnoreCase(c[0])) {
                    c = Utils.removeFromString(c, n);
                    rc = Utils.removeFromString(rc, n);
                }
                else {
                    System.out.println("Incorrect Letter. Try again");
                }
                if(!(rc.length == 0)) {
                    for (String s : rc) {
                        System.out.print(s + " ");
                    }
                    System.out.println(" Input: ");
                }
                else {
                    System.out.println("Task completed. The word was " + word + ".");
                }
            }
        }
        System.out.println("List completed.");
    }

}
