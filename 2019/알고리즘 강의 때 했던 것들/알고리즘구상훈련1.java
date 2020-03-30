/*�˰��� �����Ʒ� �Ĺ̰� ��� ���ΰ��� ������� quickSort ����*/
package Study;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] array = {31,3,65,73,8,11,20,29,48,15};
		quickSort(array,0,array.length-1);
		reverse(array,0,array.length-1);//ū������ ���ĵ� �迭�� ����� ���������� ����
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
		//���ΰ��� �������� ��� ���Ұ� ū ������ �����Ѵ�
		int standard = a[startIndex];//���ذ�
		int start=end+1;//1���� ������
		for(int i=end; i>startIndex; i--) {
			if(a[i]<standard) {
				start--;
				if(start!=i) swap(a,start,i);
			}
		}
		swap(a,start-1,startIndex);
		
		return start-1;
	}
	
	private static void swap(int[] a,int i,int j) {
		int reserve=a[i];
		a[i]=a[j];
		a[j]=reserve;
	}
	
	private static void reverse(int[] a,int start,int end) {
		//�迭������
		int[] temp=new int[end-start+1];
		int j=start;
		for(int i=temp.length-1; i>=0; i--) {
			temp[i]=a[j++];
		}//����� �ӽù迭�� ������
		//�ٽ� ���迭�� �ӽù迭�� ����
		for(int i=0; i<temp.length;i++) {
			a[i+start]=temp[i];
		}
	}
}
