package lecture3;

import java.util.Arrays;

public class Example5 {
	static String[] convertToArray(String s) {
		return s.replaceAll("[^a-zA-Z]+"," ").trim().split(" ");
    }

    public static void main(String[] args) {
        String[] a = { "one 2 two, - Three,\t four; @ \t\nfive..,SIX)",
           "1 one 2 two, - Three,\t four; @ \t\nfive..,SIX)" };
        for (String s : a) {
            String[] t = convertToArray(s);
            System.out.println(Arrays.toString(t));
        }
    }
}
