package Study;
/* int형 배열의 heapSort 구현*/
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] array = {31,3,65,73,8,11,20,29,48,15};
		heapSort(array);
		System.out.println(Arrays.toString(array));
	}
	
	public static void heapify(int[] a, int index, int end) {
		//왼쪽자식과 오른쪽자식의 인덱스를 구한다
		int leftChild=index*2+1;
		int rightChild=index*2+2;
		
		//종료조건 
		//배열의 마지막 원소의 인덱스가 왼쪽자식의 인덱스보다 작으면 
		//자식이 없을경우이므로 리턴
		if(end<leftChild) return;
		
		//현재작업
		if(end<rightChild) {//자식이 하나일 경우
			//자식과 index값을 비교하여 스왑한다
			if(a[index]>a[leftChild]) swap(a,index,leftChild);
		}else {//자식이 둘다 있을경우
			//왼쪽자식과 오른쪽자식을 비교해 값이 작은 값을 구한 후
			//index위치의 값보다 그 작은값이 작으면 swap 반대일경우 리턴  
			int smaller=a[leftChild]<a[rightChild]?leftChild:rightChild;
			if(a[index]>a[smaller]) {
				swap(a,index,smaller);
				//다음 단계
				//작은 자식의 index로 재귀호출
				heapify(a,smaller,end);
			}
		}
	}
	
	private static void swap(int[] a, int i,int j) {
		int reserve=a[i];
		a[i]=a[j];
		a[j]=reserve;
	}
	
	public static void buildHeap(int[] a) {//배열을 힙으로 만드는메소드
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
