/*int�� �迭�� i��° ������ ã�� ���� */
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		int[] a = { 31,8,48,73,11,3,20,29,65,15 };
		
		Scanner input = new Scanner(System.in);
		System.out.print("���° �ּҰ�?");
		int index = input.nextInt();
		
		System.out.print(select(a,0,a.length-1,index));
	}
	
	public static int select(int[] a,int start,int end, int nth) {
		if(start>=end) return a[start];//�������� �迭�� �ϳ��� ��� �� �迭�� ���Ұ��� ����
		
		int middle=partion(a,start,end);//partion �޼ҵ带 �����Ͽ� �߰����� �޾ƿ�
		int i=middle-start+1;
		//partion�� ��ġ�� ���� �ڱⰡ ���� �迭�� ��ġ�� i�� ����
		//������� 3~6�迭�� partion�� ���� �ε����� 5�̸�  5-3+1=3
		//���� �迭���� 3��°�� ���� ���̴�.
		
		if(i==nth) return a[middle];
		//i�� ã�� ���� ������ ã�����̹Ƿ�  middle�� ���� ����
		if (nth<i) return select(a, start, middle - 1, nth);//�պκп��� ���
		else
			return select(a, middle + 1, end, nth - i);//�޺κп������
	}
	
	private static int partion(int[] a,int start,int end) {
		int value=a[end];
		int i=start-1;
		for(int j=start; j<=end-1; j++) {
			if(i!=j) {
				if(a[j]<value) swap(a,++i,j);
			}
		}
		swap(a,i+1,end);
		return i+1;
	}
	
	private static void swap(int[] a,int i,int j) {
		int reserve=a[i];
		a[i]=a[j];
		a[j]=reserve;
	}
}