/*int형 배열 quicksort 구현*/
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		int[] array = {31,8,48,73,11,3,20,29,65,15};
		quickSort(array,0,array.length-1);
		System.out.print(Arrays.toString(array));
	}
	public static void quickSort(int[] array,int start,int end) {
		if(start>=end) return;
		int middle = partition(array,start,end);//partition 메소드를 실행시켜 기준값보다 작은 값들은 앞에 큰 값들을 뒤로 정렬 후 기준 값의 위치를 중앙으로 잡은 후
		quickSort(array,start,middle-1);//기준 값보다 작은 값들을 다시 퀵정렬
		quickSort(array,middle+1,end);//기준 값보다 큰 값들을 다시 퀵정렬
	}		
	
	private static int partition(int[] array,int start,int end) {
		int pivot = array[end];//기준값을 저장
		int i=start-1;//값을 비교하였을때 작은 값들을 앞쪽으로 정렬하기 위한 인덱스
		for(int j=start; j<=end-1; j++) {//배열 앞에서 부터 차례대로
			if(array[j]<pivot)//기준값과 비교하였을때 작으면
				swap(array,++i,j);//i+1 인덱스의 값과 스왑
		}
		swap(array,i+1,end);//기준값과 다비교하였을때 기준값보다 작은 값들 바로 뒤와 기준값을 바꾼 후
		return i+1;//기준값의 인덱스를 리턴
	}
	
	private static void swap(int[] array, int i, int j) {//바꾸기
		int reserve=array[i];
		array[i]=array[j];
		array[j]=reserve;
	}
}
