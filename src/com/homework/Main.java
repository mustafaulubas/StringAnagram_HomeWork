package com.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please write your first word: ");
        String word = new Scanner(System.in).next();

        System.out.println("Please write your second word: ");
        String anagram = new Scanner(System.in).next();

        /*if (isAnagram(word, anagram) == true){
            System.out.println("These two words are anagram words.");
        }else{
            System.out.println("These two words are not anagram words.");
        }*/

        if (iAnagram(word, anagram) == true){
            System.out.println("These two words are anagram words.");
        }else{
            System.out.println("These two words are not anagram words.");
        }


    }

    /*public static boolean isAnagram(String word, String anagram){
        if(word.length() != anagram.length()){
            return false;
        }

        char[] chars = word.toCharArray();

        for(char c : chars){
            int index = anagram.indexOf(c);
            if(index != -1){
                anagram = anagram.substring(0,index) + anagram.substring(index +1, anagram.length());
            }else{
                return false;
            }
        }

        return anagram.isEmpty();
    }*/

    public static boolean iAnagram(String word, String anagram){

        char [] charFromWord = word.toCharArray();
        char [] charFromAnagram = anagram.toCharArray();
        Arrays.sort(charFromWord);
        Arrays.sort(charFromAnagram);

        return Arrays.equals(charFromWord, charFromAnagram);
    }

    }

    // there are two methods about solving the problem about
    // anagram strings in this project
    // first one is about deleting chars and if result is
    // empty it means these two words are anagrams
    // the second one is about making strings arrays and
    // sorting them