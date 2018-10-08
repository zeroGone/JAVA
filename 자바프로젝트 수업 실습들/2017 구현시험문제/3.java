/* countVowel 메소드 구현
 * 'a' 문자와 'A' 문자의 수를 count[0] 에 대입하고,
 * 'e' 문자와 'E' 문자의 수를 count[1] 에 대입하고,
 * 'i' 문자와 'I' 문자의 수를 count[2] 에 대입하고,
 * 'o' 문자와 'O' 문자의 수를 count[3] 에 대입하고,
 * 'u' 문자와 'U' 문자의 수를 count[4] 에 대입해야 한다.
 * */
public class Main {

	static void countVowel(String s, int[] count) {
		for(int i=0; i<count.length; i++) count[i]=0;
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c=='a'||c=='A') count[0]++;
			else if(c=='e'||c=='E') count[1]++;
			else if(c=='i'||c=='I') count[2]++;
			else if(c=='o'||c=='O') count[3]++;
			else if(c=='u'||c=='U') count[4]++;
		}
    }

    public static void main(String[] args) {
    	String[] a = { "hello", "1234", "HELLO world", "aeiou AEIOU" };
        int[] count = new int[5];
        System.out.println("A E I O U");
        System.out.println("---------");
        for (String s : a) {
            countVowel(s, count);
            System.out.printf("%d %d %d %d %d %s\n", count[0], count[1], count[2], count[3], count[4], s);
        }
    }
}
