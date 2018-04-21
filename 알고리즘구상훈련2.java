/*�˰��� �����Ʒ� �Ĺ̰� ��� ���ΰ��� ������� quickSort ����*/
package Study;
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
	
	private static int partition(int[] a,int startIndex,int end) {
		int standard = a[startIndex];//���ذ�
		int start=startIndex;//1���� ������
		for(int i=start; i<=end; i++) {
			if(a[i]<standard) {
				start++;
				if(start!=i) swap(a,start,i);
			}
		}
		//start��ġ���� ���ذ����� ���������� ���ĵ� �迭���� ���κ��� ���ܼ�
		for(int i=startIndex;i<start;i++) {
			a[i]=a[i+1];
		}
		a[start]=standard;//���ذ����� ���� �չ迭�� �Ĺ̿� ���ذ��� �־��ְ�
		
		return start;//���ذ��� �ִ� start�� �����Ѵ�
	}
	
	private static void swap(int[] a,int i,int j) {
		int reserve=a[i];
		a[i]=a[j];
		a[j]=reserve;
	}
}
