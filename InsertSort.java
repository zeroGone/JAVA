/*int�� �迭�� �������� ����*/
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		int[] array = {17,14,11,19,13,15,18,12,16,20};
		insertSort(array);
		System.out.print(Arrays.toString(array));
	}
	public static void insertSort(int[] array) {
		for(int i=1; i<array.length; i++) {
			int value=array[i];//�迭�� i��° ���� value ������ �ʱ�ȯ�ڿ�
			for(int j=i;j>=0;j--) {//value���� ū������ ��ĭ�� �ڷι̷�� 
				if(array[j]>value) {
					array[j+1]=array[j];
					array[j]=value;//value���� ū����� ��ĭ�� �ٲ㰡�� ���� �ڸ��� ���´�
				}
			}
		}
	}
}
