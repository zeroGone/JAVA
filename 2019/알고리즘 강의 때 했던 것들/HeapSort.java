/*int형 배열 heapSort 구현 */
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		int[] a = { 31,3,65,73,8,11,20,29,48,15 };
		heapSort(a);
		System.out.println(Arrays.toString(a));
	}
	
	static void heapSort(int[] a) {
		buildHeap(a);//배열을 힙으로 먼저 만든다
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
		int leftChild = 2 * index + 1;//왼쪽자식의 인덱스
		int rightChild = 2 * index + 2;//오른쪽자식의 인덱스
		int smaller;//작은 값으로 초기화하기 위한 참조 변수
		if (rightChild <= endIndex)//오른쪽자식보다 마지막인덱스가 크거나 같은 경우는 자식이 둘다 있을경우
			smaller = (a[leftChild] > a[rightChild]) ? leftChild : rightChild;//두 자식 값을 비교해 smaller 변수에 초기화
		else if (leftChild <= endIndex)//왼쪽자식보다 마지막인덱스가 크거나 같은 경우는 자식이 하나 일 경우
			smaller = leftChild;//왼쪽자식으로 초기화
		else//자식이 없으면
			return;//리턴
		if (a[smaller] > a[index]) {//index 위치의 값보다 smaller 위치의 값이 크면
			swap(a, smaller, index);//두 값을 바꾸고
			heapify(a, smaller, endIndex);//바꾼 smaller로 heapify 재귀 호출
		}
	}

	static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	
	
}