package Study;
/* int�� �迭�� mergeSort ����*/
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] array = {31,3,65,73,8,11,20,29,48,15};
		mergeSort(array,0,array.length-1);
		System.out.println(Arrays.toString(array));
	}
	
	public static void mergeSort(int[] a,int start,int end) {
		if(start<end) {//�������� �迭�� ���Ұ����� �ϳ��� �� �����Ѵ�
			//�����۾� �迭�� ������ ������
			//�չ迭�� �޹迭�� ������ �� �����Ѵ�
			int middle=(start+end)/2;
			mergeSort(a,start,middle);
			mergeSort(a,middle+1,end);
			merge(a,start,middle,end);
		}
	}
	
	private static void merge(int[] a,int start,int middle,int end) {
		//���� �迭�� �����Ͽ� �����ϴ� �޼ҵ�
		int[] array=new int[end-start+1];//�ӽù迭
		int i=0;//�ӽù迭�� �ε����� ���� ����
		int index1=start;//�չ迭�� ���� �ε���
		int index2=middle;//�ڹ迭�� ���� �ε���
		
		while(index1<=middle-1&&index2<=end) {//�չ迭�� �ڹ迭 ������ �������� �ݺ�
			if(a[index1]<a[index2])//�չ迭�� ���Ұ� ������
				array[i++]=a[index1++];//�ӽù迭�� �չ迭 ���Ҹ� ���� �� ����
			else if(a[index1]>a[index2])//�޹迭�� ���Ұ� ������
				array[i++]=a[index2++];//�ӽù迭�� �޹迭 ���Ҹ� ���� �� ����
		}
		//�������� �迭 �� ���� ���ҵ��� �����Ѵ�
		while(index1<=middle-1||index2<=end) {
			if(index1<=middle-1) array[i++]=a[index1++];
			else array[i++]=a[index2++];
		}
		
		for(i=0; i<array.length; i++) {
			a[start+i]=array[i];//���ĵ� �ӽù迭�� �� �迭�� �����Ѵ�
		}
	}
}
