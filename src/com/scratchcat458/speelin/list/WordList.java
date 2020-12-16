package com.scratchcat458.speelin.list;

public class WordList {
    private String name;
    private String author;
    private String[] words;

    public WordList() {
    }
    // Basic
    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setWords(String[] words) {
        this.words = words;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getSize() {
        return words.length;
    }

    public String[] getWords() {
        return words;
    }
}