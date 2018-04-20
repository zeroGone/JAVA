package Study;
/* int�� �迭�� quickSort ����*/
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] array = {31,3,65,73,8,11,20,29,48,15};
		quickSort(array,0,array.length-1);
		System.out.println(Arrays.toString(array));
	}
	
	public static void quickSort(int[] a, int start, int end) {
		//�������� �迭�� ���Ұ� �ϳ��϶� 
		if(start>=end) return;
		
		//�����۾� ��Ƽ���� �����Ͽ� ������ �� 
		//���ذ��� �޾ƿ���
		int middle=partition(a,start,end);
		
		//�����۾� �չ迭�� �޹迭�� quickSort�� �ٽ� �����Ѵ�.
		quickSort(a,start,middle-1);
		quickSort(a,middle+1,end);
	}
	
	private static int partition(int[] a,int startIndex,int standardIndex) {
		int standard = a[standardIndex];//���ذ�
		int start=startIndex-1;//1���� ������
		for(int i=startIndex; i<standardIndex; i++) {
			if(i!=start) {//i��start�� ������ ���ڸ� �ٲٱ⸦ �����ʵ��� �ϴ� ���ǹ�
				if(standard>a[i]) swap(a,++start,i);
			}	
		}
		swap(a,start+1,standardIndex);
		return start+1;
	}
	
	private static void swap(int[] a,int i,int j) {
		int reserve=a[i];
		a[i]=a[j];
		a[j]=reserve;
	}
}
