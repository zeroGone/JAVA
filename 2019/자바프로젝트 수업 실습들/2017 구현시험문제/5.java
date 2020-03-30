/* converToSnakeCase 메소드 구현
 * 파라미터 문자열에서 대문자를 소문자로 바꾸고, 그 앞에 '_' 문자를 삽입하여 리턴한다.
 * 그런데, 결과 문자열의 선두에는 '_' 문자를 삽입하지 않는다.
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
