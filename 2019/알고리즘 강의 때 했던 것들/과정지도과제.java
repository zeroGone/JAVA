import java.util.Scanner;

/*�˰��� �Ʒ�
 *���� ���ڸ� 2������ �ٲٰ�
 *�ٲ� 2������ 0�� ���������� ���̳����� �� ����ϱ�
 *ex) 529=1000010001 ���:4,3
 *��������:IntegerŬ������ 2���� ��ȯ �޼ҵ� ���� �ʱ�
 * */

public class Main {
	public static int N;//����ڰ� �Է��� ���� �������� ��ȯ�� ��

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�Է�:");
		int num = input.nextInt();
		binary(num);
		System.out.println(N);

		String str=Integer.toString(N);
		gap(str,0,0);
	}
	
	public static void gap(String str,int i,int num) {
		if(i>=str.length()) return;
		if(str.charAt(i)=='0') {
			num++;
		}else {
			if(num>0) {
				System.out.print(num+" ");
				num=0;
			}
		}
		gap(str,++i,num);
	}

	public static void binary(int num) {
		if(num==0) return;//��������:num�� 0�϶�
		int n=divisionNum(num);//num�� 2�� ��� ���� �� �ִ��� ����
		int value=1<<n;//num�� �ٻ��� 2n�� ���� value�� �����Ѵ�
		N+=sib(n);//�������� N�� num�� ������ȭ�� ���� ���ϰ�
		binary(num-value);//�����۾�:num�� value�� �������� ���ȣ���Ѵ�
	}
	
	public static int divisionNum(int num) {//num�� 2�� ��� ���� �� �ִ� �� ���� �޼ҵ�
		if(num==1) return 0;
		return 1+divisionNum(num/2);
	}
	
	public static int sib(int i) {//�������� �������� ǥ���ϱ� ���� �޼ҵ�
		if(i==0) return 1;
		return 10*sib(--i);
	}
}
