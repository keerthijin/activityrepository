package com.bufferpollproject;

import java.util.LinkedHashSet;
import java.util.Set;

public class Duplicatename  {

    public static void main(String[] args) {
        String[] test = {"keerthi", "jin", "jimin", "lisa", "taea", "lisa", "jhope", "rose", "rose"};
        String[] deduped = removeDuplicate(test);
        print(deduped);
    }

    public static String[] removeDuplicate(String[] words) {
        Set<String> wordSet = new LinkedHashSet<String>();
        for (String word : words) {
            wordSet.add(word);
        }
        return wordSet.toArray(new String[wordSet.size()]);
    }

    public static void print(String[] words) {
        for (String word : words) {
            System.out.println(word);
        }
    }
}


