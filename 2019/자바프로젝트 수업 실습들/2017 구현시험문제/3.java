/* countVowel �޼ҵ� ����
 * 'a' ���ڿ� 'A' ������ ���� count[0] �� �����ϰ�,
 * 'e' ���ڿ� 'E' ������ ���� count[1] �� �����ϰ�,
 * 'i' ���ڿ� 'I' ������ ���� count[2] �� �����ϰ�,
 * 'o' ���ڿ� 'O' ������ ���� count[3] �� �����ϰ�,
 * 'u' ���ڿ� 'U' ������ ���� count[4] �� �����ؾ� �Ѵ�.
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
