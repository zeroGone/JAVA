/*int형 배열의 선택정렬 구현*/
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] array = {17,14,11,19,13,15,18,12,16,20};
		selectSort(array);
		
		System.out.print(Arrays.toString(array));
	}
	public static void selectSort(int[] array) {
		for(int i=0; i<array.length-1; i++) {
			int min=findMin(array,i);//최소값을 찾은후
			swap(array,i,min);//i번째 원소와 최소값을 바꾼다
		}
	}
	
	private static void swap(int[] array,int i,int min) {
		int reserve=array[i];
		array[i]=array[min];
		array[min]=reserve;
	}
	
	private static int findMin(int[] array,int index) {//배열의 최소값 인덱스를 리턴하는 메소드
		int minIndex=index;
		for(int i=index+1; i<array.length; i++) {
			if(array[minIndex]>array[i]) {
				minIndex=i;
			}
		}
		return minIndex;
	}
}
