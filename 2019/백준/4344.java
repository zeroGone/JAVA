/* 4344�� ����� �Ѱ���
 * ���л� ��������� 90%�� �ڽ��� �ݿ��� ����� �Ѵ´ٰ� �����Ѵ�. 
 * ����� �׵鿡�� ���� ������ �˷���� �Ѵ�.
 * �Է�:
 * ù° �ٿ��� �׽�Ʈ���̽��� ���� C�� �־�����.
 * ��° �ٺ��� �� �׽�Ʈ���̽����� �л��� �� N(1 �� N �� 1000, N�� ����)�� ù ���� �־�����, 
 * �̾ N���� ������ �־�����. 
 * ������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�.
 * ���:
 * �� ���̽����� �� �پ� ����� �Ѵ� �л����� ������ �ݿø��Ͽ� �Ҽ��� ��°�ڸ����� ����Ѵ�.
 * */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int C = input.nextInt();//�׽�Ʈ���̽� ���� �޾ƿ���
		int[][] testCase = new int[C][];//�л�����ŭ�� �������� �޾ƿ��� ���� 2�����迭
		
		for(int i=0; i<testCase.length; i++) {
			int N = input.nextInt();//�л��� �ް�
			testCase[i]=new int[N];//�л�����ŭ�� �迭 ����
			for(int j=0; j<testCase[i].length; j++) {
				testCase[i][j]=input.nextInt();//���� �ٹ���
			}
		}
		
		double[] avg = new double[C];//��հ����� ������ �迭
		for(int i=0; i<testCase.length; i++) {
			double sum=0;//����
			for(int j=0; j<testCase[i].length; j++) {
				sum+=testCase[i][j];
			}
			avg[i]=sum/testCase[i].length;
		}
		
		int[] stuNum = new int[C];//����� �Ѵ� �л������� ������ �迭
		for(int i=0; i<testCase.length; i++) {
			for(int j=0; j<testCase[i].length; j++) {
				if(avg[i]<(double)testCase[i][j]) stuNum[i]++;
			}
		}
		//�ݿø��Ͽ� �Ҽ��� ��°�ڸ� ����ϴ°�
		//printf��¿��� %�� ����ϱ����ؼ� %%�� ����Ѵ�
		//�ݿø��ϴ� ����� �̿ܿ��� Math.round�� �����
		//�������װڴ�
		for(int i=0; i<testCase.length; i++) {
			System.out.printf("%.3f%%\n",(double)stuNum[i]/(double)testCase[i].length*100);
		}
		
		
	}

}
