/* reverse �޼ҵ� ����
 * ���ڿ� �迭 ���ҵ� ������ ��.
 * */
public class Main {

	static String reverse(String s) {
		StringBuilder b = new StringBuilder();
		for(int i=s.length()-1; i>=0; i--) {
			b.append(s.charAt(i));
		}
		return b.toString();
    }

    public static void main(String[] args) {
        String[] a = { "a", "1234", "hello" };
        for (String s : a)
            System.out.printf("%s ", reverse(s));
    }
}
