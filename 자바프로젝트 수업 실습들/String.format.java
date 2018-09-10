/* String.format 메소드 연습
 * 형식: "% [argument index] [flag] [width] [.precision] type"
 * argument index 의 default 는 맨 뒤부터, 아닐 시 숫자
 * flag 
 * :출력 값이 숫자일 경우 flag에 + 이면 숫자앞에 부호를 붙임, 0일 경우 숫자 앞에 0을 채움
 *  출력 값이 문자열일 경우 flag가 -면 왼쪽 정렬, 없을 시 오른쪽 정렬
 * width : 최소폭 지정
 * .precession : 숫자일 경우 소수점 아래 자리수 지정, 문자열일 경우  출력할 최대 문자수 지정
 * type: d 정수, s 문자열, f 실수, x 16진수.
 *  */
public class Main {

	public static void main(String[] args) {
		int[] a1 = new int[] { 345, 12, 478, 1003 }; 
		double[] a2 = new double[] { 23.24, 301.234, 3.1235, 98.0238 }; 
		String[] a3 = new String[] { "one", "two", "three", "four" };
		
		System.out.println("       int     double     String"); 
		System.out.println("---------- ---------- ----------");

		
		for(int i=0; i<a1.length; i++) {
			String s1 = String.format("%10s %10s %10s", a1[i], a2[i], a3[i] );
			System.out.println(s1);
		}
	
	}
	

}
