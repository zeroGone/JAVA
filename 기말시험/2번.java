package Study;
/* int형 배열의 mergeSort 구현*/
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] array = {4,13,5,8,1};
		mergeSort(array,0,array.length-1);
	}

	public static void mergeSort(int[] a,int start,int end) {
		if(start==end) return;//종료조건 배열의 원소개수가 하나일 때 리턴한다
		//현재작업 배열을 반으로 나누고
		//앞배열과 뒷배열을 정렬한 후 병합한다
		int middle=(start+end)/2;
		mergeSort(a,start,middle);
		mergeSort(a,middle+1,end);
		merge(a,start,middle,end);
		System.out.println(Arrays.toString(a));

	}

	private static void merge(int[] a,int start,int middle,int end) {
		//나눈 배열을 정렬하여 병합하는 메소드
		int[] array=new int[end-start+1];//임시배열
		int i=0;//임시배열의 인덱스를 위한 변수
		int index1=start;//앞배열의 시작 인덱스
		int index2=middle+1;//뒤배열의 시작 인덱스

		while(index1<=middle&&index2<=end) {//앞배열과 뒤배열 끝까지 갈때까지 반복
			if(a[index1]<a[index2])//앞배열의 원소가 작으면
				array[i++]=a[index1++];//임시배열에 앞배열 원소를 저장 후 증가
			else if(a[index1]>a[index2])//뒷배열의 원소가 작으면
				array[i++]=a[index2++];//임시배열에 뒷배열 원소를 저장 후 증가
		}
		//나누어진 배열 중 남은 원소들을 복사한다
		while(index1<=middle||index2<=end) {
			if(index1<=middle) array[i++]=a[index1++];
			else array[i++]=a[index2++];
		}

		for(i=0; i<array.length; i++) {
			a[start+i]=array[i];//정렬된 임시배열을 본 배열에 복사한다
		}
	}
}
