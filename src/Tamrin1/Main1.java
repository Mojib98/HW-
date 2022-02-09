package Tamrin1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        SaveRandomWord saveRandomWord = new SaveRandomWord();
//        saveRandomWord.createWord();
        Scanner scanner = new Scanner(System.in);

        HashMap<String, ArrayList<String>> dict = new HashMap<>();
        HashMap<String, ArrayList<String>> dict2 = new HashMap<>();
        System.out.println("insert");
        String s1 =scanner.next();
        System.out.println("insert");
        String s2 = scanner.next();
        dict = saveRandomWord.createWord(s1);
        dict2 = saveRandomWord.createWord(s2);
   //     dict2 = saveRandomWord.createWord(s2);
        saveRandomWord.Compare(dict,dict2);


    }
}
