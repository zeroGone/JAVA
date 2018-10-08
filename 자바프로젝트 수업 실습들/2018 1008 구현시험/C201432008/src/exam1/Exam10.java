package exam1;

public class Exam10 {
	static String removeSubstring(String s, int fromIndex, int toIndex) {
		StringBuilder b = new StringBuilder();
		for(int i=0; i<s.length(); i++) b.append(s.charAt(i));
		b.delete(fromIndex, toIndex);
		return b.toString();
	}

	public static void main(String[] args) {
		String[] a = { "hello", "world", "hello hello" };
		System.out.println(removeSubstring(a[0], 1, 4));
		System.out.println(removeSubstring(a[1], 2, 4));
		System.out.println(removeSubstring(a[2], 2, 5));
	}
}
