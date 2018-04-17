/*int�� �迭 mergesort ����*/
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		int[] array = {17,14,11,19,13,15,18,12,16,20};
		mergeSort(array,0,array.length-1);
		System.out.print(Arrays.toString(array));
	}
	public static void mergeSort(int[] array,int start, int end) {
		if(start==end) return;//�迭�� ũ�Ⱑ 1�̸� �׳� �����Ѵ�
		int middle=(start+end)/2;//�߰����� ����
		mergeSort(array,start,middle);//�迭�� �պκ� �����ϱ� ���� ���ȣ���Ѵ�
		mergeSort(array,middle+1,end);//�迭�� �޺κ� �����ϱ� ���� ���ȣ��
		merge(array,start,middle,end);//�������� �迭���� ����
	}

	private static void merge(int[] array,int start,int middle, int end) {
		int length=end-start+1;//�ӽù迭�� ����
		int[] reserve = new int[length];//�ӽù迭
		
		int i=0;//�ӽù迭�� ���Ҹ� ������ ��������
		int index1=start;//�����迭�� ���� ��ȸ�ϱ� ���� �ε��� ����
		int index2=middle+1;//
		while(index1<=middle&&index2<=end) {//�������� �ι迭�� ������ ���� ��ȸ�ϱ� ���� ����
			if(array[index1]<array[index2])
				reserve[i++]=array[index1++];
			else
				reserve[i++]=array[index2++];
		}
		while(index1<=middle)//�� �� �߿� �������� ��(ex:�� �� �迭�� �˻簡 �̹̳����� ��) �ִ� ������ �ٽ� ����
			reserve[i++]=array[index1++];
		while(index2<=end)
			reserve[i++]=array[index2++];
		
		for(i=0; i<reserve.length; i++) {
			array[start+i]=reserve[i];//���ĵ� �ӽù迭�� �����迭�� ����
		}
	}
}
