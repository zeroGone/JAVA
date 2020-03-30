/*int�� �迭 heapSort ���� */
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		int[] a = { 31,3,65,73,8,11,20,29,48,15 };
		heapSort(a);
		System.out.println(Arrays.toString(a));
	}
	
	static void heapSort(int[] a) {
		buildHeap(a);//�迭�� ������ ���� �����
		for (int end = a.length - 1; end >= 1; --end) {//
			swap(a, 0, end);
			heapify(a, 0, end - 1);
		}
	}
	
	static void buildHeap(int[] a) {
		int end = a.length - 1;
		for (int i = end / 2; i >= 0; --i)
			heapify(a, i, end);
	}
	

	static void heapify(int[] a, int index, int endIndex) {
		int leftChild = 2 * index + 1;//�����ڽ��� �ε���
		int rightChild = 2 * index + 2;//�������ڽ��� �ε���
		int smaller;//���� ������ �ʱ�ȭ�ϱ� ���� ���� ����
		if (rightChild <= endIndex)//�������ڽĺ��� �������ε����� ũ�ų� ���� ���� �ڽ��� �Ѵ� �������
			smaller = (a[leftChild] > a[rightChild]) ? leftChild : rightChild;//�� �ڽ� ���� ���� smaller ������ �ʱ�ȭ
		else if (leftChild <= endIndex)//�����ڽĺ��� �������ε����� ũ�ų� ���� ���� �ڽ��� �ϳ� �� ���
			smaller = leftChild;//�����ڽ����� �ʱ�ȭ
		else//�ڽ��� ������
			return;//����
		if (a[smaller] > a[index]) {//index ��ġ�� ������ smaller ��ġ�� ���� ũ��
			swap(a, smaller, index);//�� ���� �ٲٰ�
			heapify(a, smaller, endIndex);//�ٲ� smaller�� heapify ��� ȣ��
		}
	}

	static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	
	
}