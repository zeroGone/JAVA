public class Main {
	
    static String[] split1(String s) {
    	s=s.replace(" ", "");
    	String[] s2=s.split(",");
    	return s2;
    }
    //trim 공백제거
    static String[] split2(String s) {
    	String[] s2 = s.split(",");
    	for(int i=0;i<s2.length;i++) {
    		s2[i]=s2[i].trim();
    	}
    	return s2;
    }

    public static void main(String[] args) {
        String s = "One, Two ,Three , Four,Five";
        String[] a1 = split1(s);
        for (String t : a1)
            System.out.printf("[%s]\n", t);
        String[] a2 = split2(s);
        for (String t : a2)
            System.out.printf("[%s]\n", t);
    }

}