/*알고리즘 구상훈련 후미값 대신 선두값을 기준잡는 quickSort 구현*/
package Study;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] array = {31,3,65,73,8,11,20,29,48,15};
		quickSort(array,0,array.length-1);
		reverse(array,0,array.length-1);//큰순으로 정렬된 배열을 뒤집어서 작은순으로 정렬
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
		//선두값을 기준으로 잡아 원소가 큰 순으로 정렬한다
		int standard = a[startIndex];//기준값
		int start=end+1;//1구역 시작점
		for(int i=end; i>startIndex; i--) {
			if(a[i]<standard) {
				start--;
				if(start!=i) swap(a,start,i);
			}
		}
		swap(a,start-1,startIndex);
		
		return start-1;
	}
	
	private static void swap(int[] a,int i,int j) {
		int reserve=a[i];
		a[i]=a[j];
		a[j]=reserve;
	}
	
	private static void reverse(int[] a,int start,int end) {
		//배열뒤집기
		int[] temp=new int[end-start+1];
		int j=start;
		for(int i=temp.length-1; i>=0; i--) {
			temp[i]=a[j++];
		}//뒤집어서 임시배열에 넣은후
		//다시 본배열에 임시배열을 복사
		for(int i=0; i<temp.length;i++) {
			a[i+start]=temp[i];
		}
	}
}
