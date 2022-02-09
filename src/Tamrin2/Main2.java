package Tamrin2;

import java.util.SortedSet;
import java.util.TreeSet;

public class Main2 {
    public static void main(String[] args) {
        SortedSet<Character> sortedSet = new TreeSet<>();
        SortedSet<Character> sortedSet1 = new TreeSet<>();
        Test1 t = new Test1();
        sortedSet=t.tes();
        sortedSet1=t.tes();
        t.intersection(sortedSet1,sortedSet);
        t.union(sortedSet1,sortedSet);
    }
}
