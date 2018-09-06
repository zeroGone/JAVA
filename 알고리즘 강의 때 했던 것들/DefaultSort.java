/*int형 배열 앞부분에는 짝수, 뒷부분에는 홀수가 위치*/
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		int[] array = {17,14,11,19,13,15,18,12,16,20};
		Sort(array);
		System.out.print(Arrays.toString(array));
	}
	public static void Sort(int[] array) {
		int z=array.length-1;//뒤에서부터 홀수를 검사할 변수
		for(int i=0; i<array.length; i++) {
			if(array[i]%2!=0) {//i번째요소가 홀수이면
				while(array[z]%2!=0&&z>i) {//뒤에서부터 짝수인 값을 찾음
					z--;
				}
				swap(array,i,z);//i번째와 z번째 요소를 바꿈
			}
		}
	}
	
	private static void swap(int[] array,int i,int j) {
		int reserve = array[i];
		array[i]=array[j];
		array[j]=reserve;
	}
}
