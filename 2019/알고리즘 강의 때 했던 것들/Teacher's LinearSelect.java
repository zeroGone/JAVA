/*선택알고리즘 LinearSelect구현*/
import java.util.Arrays;
public class LinearSelect {
	public static void main(String[] args) {
		int[] a= {20, 18, 15, 19, 23, 11, 12, 25, 16, 13, 29, 22, 24, 14, 17,21, 27, 26};
		System.out.println(linearSelect(a,0,a.length-1,9));
		System.out.println(Arrays.toString(a));
	}
	
	public static int linearSelect(int[] a,int start,int end,int nth) {
		//1.원소의 수가 5개 이하면 정렬 후 원하는 값을 찾는다
		int length=end-start+1;//배열의 크기
		if(length<=5) {
			quickSort(a,start,end);
			return a[start+nth-1];
		}
		//2.배열을 5개 크기 배열로 그룹을 나눈다
		int[] a1=new int[(length+4)/5];//그룹의 수는 n/5
		
		//3.각그룹을 정렬하고 그룹의 중앙값들을 모아서 새 배열로 만든다
		for(int i=0;i<a1.length;i++) {
			int start1=start+i*5;
			int end1=Math.min(start1+5, end);//두 파라미터 중 작은값을 반환하는 Math.min메소드
			quickSort(a,start1,end1);
			a1[i]=a[(start1+end1)/2];
		}
	
		//4.새 배열의 중앙값을 구한다
		int groupMiddle=linearSelect(a1,0,a1.length-1,a1.length/2);
		
		//5.middle값 기준으로 본 배열을 분할한다
		int middleIndex=findIndex(a,start,end,groupMiddle);//middle값의 본 배열의 실제 인덱스를 찾고 
		int middle=partition(a,start,end,middleIndex);//파티션한다
		
		//6.middle위치의 M값은 middle-start+1번째 작은값
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
