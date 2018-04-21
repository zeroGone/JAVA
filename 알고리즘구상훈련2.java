/*알고리즘 구상훈련 후미값 대신 선두값을 기준잡는 quickSort 구현*/
package Study;
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
	
	private static int partition(int[] a,int startIndex,int end) {
		int standard = a[startIndex];//기준값
		int start=startIndex;//1구역 시작점
		for(int i=start; i<=end; i++) {
			if(a[i]<standard) {
				start++;
				if(start!=i) swap(a,start,i);
			}
		}
		//start위치까지 기준값보다 작은순으로 정렬된 배열들을 선두부터 땡겨서
		for(int i=startIndex;i<start;i++) {
			a[i]=a[i+1];
		}
		a[start]=standard;//기준값보다 작은 앞배열의 후미에 기준값을 넣어주고
		
		return start;//기준값이 있는 start를 리턴한다
	}
	
	private static void swap(int[] a,int i,int j) {
		int reserve=a[i];
		a[i]=a[j];
		a[j]=reserve;
	}
}
