/*int�� �迭 �պκп��� ¦��, �޺κп��� Ȧ���� ��ġ*/
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		int[] array = {17,14,11,19,13,15,18,12,16,20};
		Sort(array);
		System.out.print(Arrays.toString(array));
	}
	public static void Sort(int[] array) {
		int z=array.length-1;//�ڿ������� Ȧ���� �˻��� ����
		for(int i=0; i<array.length; i++) {
			if(array[i]%2!=0) {//i��°��Ұ� Ȧ���̸�
				while(array[z]%2!=0&&z>i) {//�ڿ������� ¦���� ���� ã��
					z--;
				}
				swap(array,i,z);//i��°�� z��° ��Ҹ� �ٲ�
			}
		}
	}
	
	private static void swap(int[] array,int i,int j) {
		int reserve = array[i];
		array[i]=array[j];
		array[j]=reserve;
	}
}
