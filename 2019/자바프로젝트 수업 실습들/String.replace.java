public class Main {
	//replace ¸Þ¼Òµå
    static String removeO(String s) {
    	s=s.replace("o", "");
    	s=s.replace("O", "");
    	return s;
    }

    public static void main(String[] args) {
        String[] a = new String[] { "One", "Two", "Three", "Four", "Five", "hello world", "yahoo" };
        for (String s : a) {
            String temp = removeO(s);
            System.out.println(temp);
        }
    }

}