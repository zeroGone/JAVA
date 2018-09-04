/* 2018�� ����� ī�������� �̿�
 * ���� ó���ϴ� ���� ����п��� ����� �߿��� ���̴�. 
 * ����п��� N���� ���� ��ǥ�ϴ� �⺻ ��谪���� ������ ���� �͵��� �ִ�. 
 * ��, N�� Ȧ����� ��������.
 * ������ : N���� ������ ���� N���� ���� ��
 * �߾Ӱ� : N���� ������ �����ϴ� ������ �������� ��� �� �߾ӿ� ��ġ�ϴ� ��
 * �ֺ� : N���� ���� �� ���� ���� ��Ÿ���� ��
 * ���� : N���� ���� �� �ִ밪�� �ּҰ��� ����
 * N���� ���� �־����� ��, �� ���� �⺻ ��谪�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * �Է�:
 * ù° �ٿ� ���� ���� N(1 �� N �� 500,000)�� �־�����. 
 * �� ���� N���� �ٿ��� �������� �־�����. 
 * �ԷµǴ� ������ ���밪�� 4,000�� ���� �ʴ´�.
 * ���:
 * ù° �ٿ��� �������� ����Ѵ�. 
 * �Ҽ��� ���� ù° �ڸ����� �ݿø��� ���� ����Ѵ�.
 * ��° �ٿ��� �߾Ӱ��� ����Ѵ�.
 * ��° �ٿ��� �ֺ��� ����Ѵ�. 
 * ���� �� ���� ������ �ֺ� �� �� ��°�� ���� ���� ����Ѵ�.
 * ��° �ٿ��� ������ ����Ѵ�.
 * */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		
		int[] nums = new int[8001];//���밪��� �Է°����� �ȿ� ���ڵ��� ���� �迭
		//�������� �ε��� 4001����
		
		for(int i=0; i<N; i++) {
			int value = input.nextInt();
			if(value<0) {
				value=-value+4000;
				nums[value]++;
			}
			else nums[value]++;
		}//�迭�� �߰�
		
		double ������ = 0;
		int count = -1;
		ArrayList �߾Ӱ� = new ArrayList();
		ArrayList �ֺ� = new ArrayList();
		int ��������= Integer.MAX_VALUE; 
		int ū���� = Integer.MIN_VALUE;
		
		for(int i=0; i<nums.length; i++) //�迭�� ���ҵ� �ϳ��ϳ� ����
			for(int j=0; j<nums[i]; j++) {//���ڰ� �ѹ��̻� �����������
				int value = i;
				if(i>4000) value = -value+4000;//������ ������ �ʱ�ȭ
				if(count<=j) {//�󵵰� ����
					if(count<j) {//���� �ִ� �󵵸� ������
						count=j;//�ʱ�ȭ
						�ֺ�=new ArrayList();//�ִٺ󵵷� ����� �迭����Ʈ �ʱ�ȭ
					}
					�ֺ�.add(value);//�߰�
				}
				�߾Ӱ�.add(value);//�߾Ӱ��� �˱����� �迭�� �߰�
				������+=value;//��ձ��ϱ� ���ؼ� �ٴ���
				//��������������
				if(��������>value) �������� = value;
				if(ū����<value) ū����=value;
			}
		
		System.out.println(Math.round(������/N));//������ ��� �ݿø��� �ݴ�� ���� ����
		�߾Ӱ�.sort(null);//�߾Ӱ� �迭����
		System.out.println(�߾Ӱ�.get(�߾Ӱ�.size()/2));
		�ֺ�.sort(null);//�� ����
		if(�ֺ�.size()>1) System.out.println(�ֺ�.get(1));//�ι�° ���
		else System.out.println(�ֺ�.get(0));
		System.out.println(ū����-��������);
	}
}