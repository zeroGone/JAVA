/*int�� �迭 quicksort ����*/
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		int[] array = {31,8,48,73,11,3,20,29,65,15};
		quickSort(array,0,array.length-1);
		System.out.print(Arrays.toString(array));
	}
	public static void quickSort(int[] array,int start,int end) {
		if(start>=end) return;
		int middle = partition(array,start,end);//partition �޼ҵ带 ������� ���ذ����� ���� ������ �տ� ū ������ �ڷ� ���� �� ���� ���� ��ġ�� �߾����� ���� ��
		quickSort(array,start,middle-1);//���� ������ ���� ������ �ٽ� ������
		quickSort(array,middle+1,end);//���� ������ ū ������ �ٽ� ������
	}		
	
	private static int partition(int[] array,int start,int end) {
		int pivot = array[end];//���ذ��� ����
		int i=start-1;//���� ���Ͽ����� ���� ������ �������� �����ϱ� ���� �ε���
		for(int j=start; j<=end-1; j++) {//�迭 �տ��� ���� ���ʴ��
			if(array[j]<pivot)//���ذ��� ���Ͽ����� ������
				swap(array,++i,j);//i+1 �ε����� ���� ����
		}
		swap(array,i+1,end);//���ذ��� �ٺ��Ͽ����� ���ذ����� ���� ���� �ٷ� �ڿ� ���ذ��� �ٲ� ��
		return i+1;//���ذ��� �ε����� ����
	}
	
	private static void swap(int[] array, int i, int j) {//�ٲٱ�
		int reserve=array[i];
		array[i]=array[j];
		array[j]=reserve;
	}
}
