/*String형 배열 mergeSort 구현*/
package Study;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		String[] a = { "zero", "one", "two", "three", "four", "five", "six", "seven" };
		mergeSort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
	}
	
	private static void mergeSort(String[] a,int start,int end) {
		//종료조건 배열이 한개일때 리턴
		if(start<end) {
			int middle=(end+start)/2;
			mergeSort(a,start,middle);
			mergeSort(a,middle+1,end);
			merge(a,start,middle,end);
		}
	}
	
	private static void merge(String[] a,int start,int middle,int end) {
		String[] temp=new String[end-start+1];
		int i=0;//임시배열 인덱스
		int index1=start;
		int index2=middle+1;
		while(index1<=middle&&index2<=end) {
			//index1과 index2 위치의 문자열을 비교해 index1의 값이 작으면 임시배열에 넣는다
			if(a[index1].compareTo(a[index2])<0) temp[i++]=a[index1++];
			else temp[i++]=a[index2++];
		}
		//남은배열의 원소들을 임시배열에 넣는다
		while(index1<=middle) {
			temp[i++]=a[index1++];
		}
		while(index2<=end) {
			temp[i++]=a[index2++];
		}
		//임시배열을 본배열에 복사
		for(i=0; i<temp.length; i++) {
			a[start+i]=temp[i];
		}
	}
	
}
