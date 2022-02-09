package Tamrin1;

import java.util.*;

public class SaveRandomWord {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    HashMap<String, ArrayList<String>> dict = new HashMap<>();

    public HashMap<String,ArrayList<String>> createWord(String word) {
        //System.out.println("Insert");
        //String word = scanner.next();
        int len = word.length();
        char[] character = word.toCharArray();
      int s=  findRepeat(character);
        int numberWords = factorial(len)/s;
        ArrayList<String> words = new ArrayList<>(numberWords);

       while (numberWords != 0) {
            char[] text = new char[len];
            List<Integer> number = new ArrayList<>(len);

            for (int i = 0; i < len; ) {
                int rand = random.nextInt(len);
                if (!(number.contains(rand))) {
                    number.add(rand);
                    text[i] = character[rand];
                    i++;
                }
            }

            String check = String.valueOf(text);
            if (!words.contains(check)) {
                words.add(check);
                numberWords--;

            }

        }
      //  words.remove(word);
        dict.put(word, words);
        System.out.println(dict);
        System.out.println(len);
        return  dict;

    }

    private int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }

    private int findRepeat(char[] what) {
        int re=1;
        Map<Character, Integer> whats = new HashMap<>();
        for (char c : what
        ) {
            if (whats.containsKey(c)) {
                whats.put(c, whats.get(c) + 1);
            } else
                whats.put(c, 1);

        }
        for (Integer v: whats.values()
             ) {
            re *= factorial(v);
        }
        return re;

}
//public void compare(HashMap )
    public void Compare(HashMap<String, ArrayList<String>> s1, HashMap<String, ArrayList<String>> s2){
     //  ArrayList<String> list = Collections.sort(s1.get(ss1));
   //    ArrayList<String> list2 = Collections.sort(s2.get(ss2));


        //System.out.println(s1.get(ss1));
        System.out.println(s1.values());
        System.out.println(s1.values().containsAll(s2.values()));
    //    System.out.println(s1.values());
      //  s1.
      //  System.out.println(s1.get(ss1).equals(s2.get(ss2)));
      //  System.out.println(s1.values().containsAll(s2.values()));
     //   boolean t =s1.entrySet().stream()
      //          .collect(Collectors.toMap((Function<? super Object, ? extends String>) e -> e.getKey(),
    //                    e -> e.getValue().equals(s2.get(e.getKey()))));

        if (s1.values().containsAll(s2.values())){
            System.out.println("PASS");
        }
        else
            System.out.println("FAIL");

    }




}
