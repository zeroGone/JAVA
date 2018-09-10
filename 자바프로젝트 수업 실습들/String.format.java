/* String.format �޼ҵ� ����
 * ����: "% [argument index] [flag] [width] [.precision] type"
 * argument index �� default �� �� �ں���, �ƴ� �� ����
 * flag 
 * :��� ���� ������ ��� flag�� + �̸� ���ھտ� ��ȣ�� ����, 0�� ��� ���� �տ� 0�� ä��
 *  ��� ���� ���ڿ��� ��� flag�� -�� ���� ����, ���� �� ������ ����
 * width : �ּ��� ����
 * .precession : ������ ��� �Ҽ��� �Ʒ� �ڸ��� ����, ���ڿ��� ���  ����� �ִ� ���ڼ� ����
 * type: d ����, s ���ڿ�, f �Ǽ�, x 16����.
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
