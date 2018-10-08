/* converToSnakeCase �޼ҵ� ����
 * �Ķ���� ���ڿ����� �빮�ڸ� �ҹ��ڷ� �ٲٰ�, �� �տ� '_' ���ڸ� �����Ͽ� �����Ѵ�.
 * �׷���, ��� ���ڿ��� ���ο��� '_' ���ڸ� �������� �ʴ´�.
 * */
public class Main {

	static String convertToSnakeCase(String s) {
		StringBuilder b = new StringBuilder();
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)<=90&&s.charAt(i)>=65) {
				if(i==0) b.append((char)(s.charAt(i)+32));
				else b.append("_"+(char)(s.charAt(i)+32));
			}else b.append(s.charAt(i));
		}
		
		return b.toString();
	}

	public static void main(String[] args) {
		String[] a = { "helloWorld", "oneTwoThree", "HowDoYouDo", "One" };

		for (String s : a)
			System.out.printf("%s  ", convertToSnakeCase(s));
	}
}
