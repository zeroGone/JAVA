/* 1427�� ��Ʈ�λ��̵�
 * �迭�� �����ϴ� ���� ����. ���� �־�����, �� ���� �� �ڸ����� ������������ �����غ���.
 * �Է�:
 * ù° �ٿ� �����ϰ����ϴ� �� N�� �־�����. N�� 1,000,000,000���� �۰ų� ���� �ڿ����̴�.
 * ���:
 * ù° �ٿ� �ڸ����� ������������ ������ ���� ����Ѵ�.
 * */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
	
		ArrayList<Integer> �ڸ��� = new ArrayList();
		
		int �ڸ� = 1;
		while(�ڸ�<=N) {
			�ڸ���.add(N/�ڸ�%10);
			�ڸ�*=10;
		}
		
		int[] ���� = new int[�ڸ���.size()];
		for(int i:�ڸ���) for(int j=0; j<����.length; j++) {
			if(����[j]<i) {
				for(int z=����.length-1; z>j; z--) {
					����[z]=����[z-1];
				}
				����[j]=i;
				break;
			}
		}
		
		int output = 0;
		�ڸ� = ����.length-1;
		for(int i=0; i<����.length; i++) {
			output += ����[i]*Math.pow(10,�ڸ�);
			�ڸ�-=1;
		}
			
		System.out.println(output);
	}
}