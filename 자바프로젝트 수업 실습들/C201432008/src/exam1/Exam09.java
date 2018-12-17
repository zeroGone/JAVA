package exam1;

public class Exam09 {
	static String reverse(String path) {
        StringBuilder b = new StringBuilder();
        for(int i=path.length()-1; i>=0; i--) b.append(path.charAt(i));
        return b.toString();
   }

    public static void main(String[] args) {
        String[] a = { "hello", "world", "hello world" };
        for (String s : a)
            System.out.println(reverse(s));
    }
}
