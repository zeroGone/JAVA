/* 실행 결과 출력이 아래와 같은 형태로 출력될 수 있도록, 위 코드를 완성하라.
 * */
public class Main {

	public static void main(String[] args) {
		int[] a1 = new int[] { 1, 12, 123, 1234 };
		double[] a2 = new double[] { 1.23, 2.3056, 3.1, 423.23 };
		String[] a3 = new String[] { "z", "one", "two", "three" };

		System.out.println("    int  double  String");
		System.out.println("------- ------- -------");
		for (int i = 0; i < 4; ++i) {
			String s = String.format("%-7d %7.2f %7s", a1[i], a2[i], a3[i]);
			System.out.println(s);
		}
	}
}
