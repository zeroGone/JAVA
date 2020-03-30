import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example4 {

	static String[] convertToArray(String s) {
		// ���ڿ� s���� �ܾ �����Ͽ� �ܾ� ��� �迭�� �����϶�.
		// �ܾ�� ���ĺ���θ� �����Ǿ�� �Ѵ�.
		// ���ϵǴ� �迭�� �ܾ�� ���� �ҹ��ڷ� ��ȯ�Ǿ�� �Ѵ�.
		s=s.toLowerCase();
		String regex = "[a-z]+";
		Pattern pattern = Pattern.compile(regex);
		
		Matcher matcher = pattern.matcher(s);
		String[] values = new String[6];
		int count = 0;
		while(matcher.find()) values[count++]=matcher.group(0);
		
		return values;
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
