/*int형 배열의 삽입정렬 구현*/
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		int[] array = {17,14,11,19,13,15,18,12,16,20};
		insertSort(array);
		System.out.print(Arrays.toString(array));
	}
	public static void insertSort(int[] array) {
		for(int i=1; i<array.length; i++) {
			int value=array[i];//배열의 i번째 값을 value 값으로 초기환뒤에
			for(int j=i;j>=0;j--) {//value보다 큰값들을 한칸씩 뒤로미루고 
				if(array[j]>value) {
					array[j+1]=array[j];
					array[j]=value;//value값을 큰값들과 한칸씩 바꿔가며 남은 자리에 놓는다
				}
			}
		}
	}
}
