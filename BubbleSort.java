/*int�� �迭�� �������� ����*/
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		int[] array = {17,14,11,19,13,15,18,12,16,20};
		bubbleSort(array);
		
		System.out.print(Arrays.toString(array));
	}
	public static void bubbleSort(int[] array) {
		for(int i=array.length-1; i>0; i--) {//�ְ��� ������ ������ �� �ϳ��� �˻��Ҳ� �پ��Ƿ�
			for(int j=0; j<i; j++) {//�տ������� i��°���� �ٲ�ߵǹǷ�
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
