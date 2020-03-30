/*int형 배열의 버블정렬 구현*/
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		int[] array = {17,14,11,19,13,15,18,12,16,20};
		bubbleSort(array);
		
		System.out.print(Arrays.toString(array));
	}
	public static void bubbleSort(int[] array) {
		for(int i=array.length-1; i>0; i--) {//최고값을 끝으로 정렬한 후 하나씩 검사할께 줄어드므로
			for(int j=0; j<i; j++) {//앞에서부터 i번째까지 바꿔야되므로
				if(array[j]>array[j+1])
					swap(array,j,j+1);
			}
		}
	}
	
	private static void swap(int[] array,int i,int j) {
		int reserve=array[i];
		array[i]=array[j];
		array[j]=reserve;
	}
}
