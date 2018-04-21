/*���þ˰��� LinearSelect����*/
import java.util.Arrays;
public class LinearSelect {
	public static void main(String[] args) {
		int[] a= {20, 18, 15, 19, 23, 11, 12, 25, 16, 13, 29, 22, 24, 14, 17,21, 27, 26};
		System.out.println(linearSelect(a,0,a.length-1,9));
		System.out.println(Arrays.toString(a));
	}
	
	public static int linearSelect(int[] a,int start,int end,int nth) {
		//1.������ ���� 5�� ���ϸ� ���� �� ���ϴ� ���� ã�´�
		int length=end-start+1;//�迭�� ũ��
		if(length<=5) {
			quickSort(a,start,end);
			return a[start+nth-1];
		}
		//2.�迭�� 5�� ũ�� �迭�� �׷��� ������
		int[] a1=new int[(length+4)/5];//�׷��� ���� n/5
		
		//3.���׷��� �����ϰ� �׷��� �߾Ӱ����� ��Ƽ� �� �迭�� �����
		for(int i=0;i<a1.length;i++) {
			int start1=start+i*5;
			int end1=Math.min(start1+5, end);//�� �Ķ���� �� �������� ��ȯ�ϴ� Math.min�޼ҵ�
			quickSort(a,start1,end1);
			a1[i]=a[(start1+end1)/2];
		}
	
		//4.�� �迭�� �߾Ӱ��� ���Ѵ�
		int groupMiddle=linearSelect(a1,0,a1.length-1,a1.length/2);
		
		//5.middle�� �������� �� �迭�� �����Ѵ�
		int middleIndex=findIndex(a,start,end,groupMiddle);//middle���� �� �迭�� ���� �ε����� ã�� 
		int middle=partition(a,start,end,middleIndex);//��Ƽ���Ѵ�
		
		//6.middle��ġ�� M���� middle-start+1��° ������
		int middle_nth = middle - start + 1;          
        if (nth == middle_nth) return a[middle];
        if (nth < middle_nth) 
             return linearSelect(a, start, middle - 1, nth);
        else return linearSelect(a, middle+ 1, end, nth - middle_nth);

	}
	
	private static int findIndex(int[] a, int start, int end, int middle) {
		for(int i=start;i<=end;i++) {
			if(a[i]==middle) return i;
		}
		return 0;
	}

	private static void quickSort(int[] a,int start,int end) {
		if(start<end) {
			int middle=partition(a,start,end,(start+end)/2);
			quickSort(a,start,middle-1);
			quickSort(a,middle+1,end);
		}
	}
	
	private static int partition(int[] a,int start,int end,int pivotIndex) {
		swap(a,end,pivotIndex);
		int value=a[end];
		int i=start-1;
		for(int j=start; j<end; j++) {
			if(a[j]<value) {
				++i;
				if(i!=j) swap(a,i,j);
			}
		}
		swap(a,++i,end);
		return i;
	}
	
	private static void swap(int[] a,int i,int j) {
		int reserve=a[i];
		a[i]=a[j];
		a[j]=reserve;
	}
}
