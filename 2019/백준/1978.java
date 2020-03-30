/* 1978�� �Ҽ� ã��
 * �־��� �� N�� �߿��� �Ҽ��� �� ������ ã�Ƽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * �Է�:
 * ù �ٿ� ���� ���� N�� �־�����. N�� 100�����̴�. �������� N���� ���� �־����µ� ���� 1,000 ������ �ڿ����̴�.
 * ���:
 * �־��� ���� �� �Ҽ��� ������ ����Ѵ�.
 * */
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		
		int[] a = new int[N];
		boolean[] check = new boolean[N];
		
		for(int i=0; i<a.length; i++) {
			a[i]=input.nextInt();
			if(a[i]!=1) check[i]=true;
		}
		
		for(int i=0; i<a.length; i++) for(int j=2; j<a[i]; j++) {
			if(a[i]%j==0) {
				check[i]=false;
				break;
			}
		}
		
		int count = 0;
		for(int i=0; i<check.length; i++) {
			if(check[i]) count++;
		}
		
		System.out.println(count);
	}
}