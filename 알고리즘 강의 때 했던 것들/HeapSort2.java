package Study;
/* int�� �迭�� heapSort ����*/
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] array = {31,3,65,73,8,11,20,29,48,15};
		heapSort(array);
		System.out.println(Arrays.toString(array));
	}
	
	public static void heapify(int[] a, int index, int end) {
		//�����ڽİ� �������ڽ��� �ε����� ���Ѵ�
		int leftChild=index*2+1;
		int rightChild=index*2+2;
		
		//�������� 
		//�迭�� ������ ������ �ε����� �����ڽ��� �ε������� ������ 
		//�ڽ��� ��������̹Ƿ� ����
		if(end<leftChild) return;
		
		//�����۾�
		if(end<rightChild) {//�ڽ��� �ϳ��� ���
			//�ڽİ� index���� ���Ͽ� �����Ѵ�
			if(a[index]>a[leftChild]) swap(a,index,leftChild);
		}else {//�ڽ��� �Ѵ� �������
			//�����ڽİ� �������ڽ��� ���� ���� ���� ���� ���� ��
			//index��ġ�� ������ �� �������� ������ swap �ݴ��ϰ�� ����  
			int smaller=a[leftChild]<a[rightChild]?leftChild:rightChild;
			if(a[index]>a[smaller]) {
				swap(a,index,smaller);
				//���� �ܰ�
				//���� �ڽ��� index�� ���ȣ��
				heapify(a,smaller,end);
			}
		}
	}
	
	private static void swap(int[] a, int i,int j) {
		int reserve=a[i];
		a[i]=a[j];
		a[j]=reserve;
	}
	
	public static void buildHeap(int[] a) {//�迭�� ������ ����¸޼ҵ�
		for(int i=(a.length-1)/2; i>=0; i--) {
			heapify(a,i,a.length-1);
		}
	}
	
	public static void heapSort(int[] a) {
		buildHeap(a);
		
		int endIndex=a.length-1;
		while(endIndex>0) {
			swap(a,0,endIndex);
			heapify(a,0,endIndex-1);
			endIndex--;
		}
	}
}
