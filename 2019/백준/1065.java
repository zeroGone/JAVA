/* 1065�� �Ѽ�
 * � ���� ���� X�� �ڸ����� ���������� �̷�ٸ�, �� ���� �Ѽ���� �Ѵ�. 
 * ���������� ���ӵ� �� ���� ���� ���̰� ������ ������ ���Ѵ�. 
 * N�� �־����� ��, 1���� ũ�ų� ����, N���� �۰ų� ���� �Ѽ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
 * �Է�:
 * ù° �ٿ� 1,000���� �۰ų� ���� �ڿ��� N�� �־�����.
 * ���:
 * ù° �ٿ� 1���� ũ�ų� ����, N���� �۰ų� ���� �Ѽ��� ������ ����Ѵ�.
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		System.out.println(�Ѽ�(num,1,0));
	}
	
	private static int �Ѽ�(int value,int start,int num) {
		if(value<start) return num;
		int �� = start/100%10;
		int �� = start/10%10;
		int �� = start%10;
		if(start==1000) return num;//�Է��� 1000���� �����ϱ⶧���� �˻��غ����Ѵ�..
		else if(��==0) num++;
		else if(��-��==��-��) num++;
		return �Ѽ�(value,++start,num);
	}
}
