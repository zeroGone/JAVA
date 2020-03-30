/* countVowel 메소드 구현
 * 모음 알파벳 수 리턴
 * */
public class Main {

	static int countVowel(String s) {
		s=s.toLowerCase();
		int count = 0;
		for(int i=0; i<s.length(); i++) {
			char c=s.charAt(i);
			if(c=='a'||c=='e'||c=='o'||c=='i'||c=='u') count++;
		}
		return count;
    }

    public static void main(String[] args) {
        String[] a = { "hello", "1234", "HELLO world", "aeiou AEIOU" };
        for (String s : a)
            System.out.printf("%d ", countVowel(s));
    }
}
