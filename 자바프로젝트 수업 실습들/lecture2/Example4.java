package lecture2;

import java.util.Arrays;

public class Example4 {

    static String[] convertToArray(String s) {
        // ���ڿ� s���� �ܾ �����Ͽ� �ܾ� ��� �迭�� �����϶�.
        // �ܾ�� ���ĺ���θ� �����Ǿ�� �Ѵ�.
        // ���ϵǴ� �迭�� �ܾ�� ���� �ҹ��ڷ� ��ȯ�Ǿ�� �Ѵ�.
    	s = s.toLowerCase().replaceAll("[^a-z]+", " ").trim();
    	return s.split(" ");
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
