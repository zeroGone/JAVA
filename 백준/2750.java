/* 2750 ������1
 * N���� ���� �־����� ��, �̸� ������������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * �Է�:
 * ù° �ٿ� ���� ���� N(1 �� N �� 1,000)�� �־�����. 
 * ��° �ٺ��� N���� �ٿ��� ���ڰ� �־�����. 
 * �� ���� ���밪�� 1,000���� �۰ų� ���� �����̴�. ���� �ߺ����� �ʴ´�.
 * ���:
 * ù° �ٿ� ���� ���� N(1 �� N �� 1,000)�� �־�����. ��° �ٺ��� N���� �ٿ��� ���ڰ� �־�����. �� ���� ���밪�� 1,000���� �۰ų� ���� �����̴�. ���� �ߺ����� �ʴ´�.
 * */
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		
		int[] array = new int[N];
		
		for(int i=0; i<array.length; i++) array[i]=input.nextInt();
		
		for(int i=array.length-1; i>=0; i--) {
			int max = i ;
			for(int j=0; j<i; j++) 
				if(array[max]<array[j]) max=j;
			
			int temp = array[max];
			array[max]=array[i];
			array[i]=temp;
		}
		
		for(int i=0; i<array.length; i++) System.out.println(array[i]);

	}
	
}