/* 11720��
 * N���� ���ڰ� ���� ���� �����ִ�. �� ���ڸ� ��� ���ؼ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ù° �ٿ� ������ ���� N (1 �� N �� 100)�� �־�����. ��° �ٿ� ���� N���� ������� �־�����.
 * �Է����� �־��� ���� N���� ���� ����Ѵ�.
 * */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		String num = input.next();
		
		int sum=0;
		for(int i=0; i<N; i++) {
			sum+=(num.charAt(i)-48);
		}
		System.out.println(sum);
	}
}