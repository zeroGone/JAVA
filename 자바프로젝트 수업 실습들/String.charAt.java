/* String Ŭ������ charAt �޼ҵ� ����
 * �ε����� ��ġ�� ���ڸ� ��ȯ�Ѵ�.
 * */
public class Main {
    static int getVowelCount(String s) {
    	s = s.toLowerCase();
    	int count = 0;
    	for(int i=0; i<s.length(); i++) {
    		char c = s.charAt(i);
    		if(c=='a'||c=='e'||c=='i'||c=='u'||c=='o') count++;
    	}
    	return count;
    }

    public static void main(String[] args) {
        String[] a = new String[] { "One", "Two", "Three", "Four", "Five", "hello world" };
        for (String s : a) {
            int count = getVowelCount(s);
            System.out.printf("%s %d\n", s, count);
        }
    }

}