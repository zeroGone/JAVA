public class Main {
	
    public static void main(String[] args) {
        String[] a = { " the", "world\t ", " \nwar " };

        for (String s : a) {
        	System.out.println(s);
            System.out.printf("%s %d\n", s=s.trim(), s.length());
        }
    }


}