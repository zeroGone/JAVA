package Study;
/* int형 배열의 quickSort 구현*/
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] array = {31,3,65,73,8,11,20,29,48,15};
		quickSort(array,0,array.length-1);
		System.out.println(Arrays.toString(array));
	}
	
	public static void quickSort(int[] a, int start, int end) {
		//종료조건 배열의 원소가 하나일때 
		if(start>=end) return;
		
		//현재작업 파티션을 진행하여 정렬한 뒤 
		//기준값을 받아오고
		int middle=partition(a,start,end);
		
		//다음작업 앞배열과 뒷배열의 quickSort를 다시 진행한다.
		quickSort(a,start,middle-1);
		quickSort(a,middle+1,end);
	}
	
	private static int partition(int[] a,int startIndex,int standardIndex) {
		int standard = a[standardIndex];//기준값
		int start=startIndex-1;//1구역 시작점
		for(int i=startIndex; i<standardIndex; i++) {
			if(i!=start) {//i와start가 같으면 제자리 바꾸기를 하지않도록 하는 조건문
				if(standard>a[i]) swap(a,++start,i);
			}	
		}
		swap(a,start+1,standardIndex);
		return start+1;
	}
	
	private static void swap(int[] a,int i,int j) {
		int reserve=a[i];
		a[i]=a[j];
		a[j]=reserve;
	}
}
