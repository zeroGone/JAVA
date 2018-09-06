/*int형 배열 mergesort 구현*/
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		int[] array = {17,14,11,19,13,15,18,12,16,20};
		mergeSort(array,0,array.length-1);
		System.out.print(Arrays.toString(array));
	}
	public static void mergeSort(int[] array,int start, int end) {
		if(start==end) return;//배열의 크기가 1이면 그냥 리턴한다
		int middle=(start+end)/2;//중간지점 변수
		mergeSort(array,start,middle);//배열의 앞부분 정렬하기 위해 재귀호출한다
		mergeSort(array,middle+1,end);//배열의 뒷부분 정렬하기 위해 재귀호출
		merge(array,start,middle,end);//나누어진 배열들을 병합
	}

	private static void merge(int[] array,int start,int middle, int end) {
		int length=end-start+1;//임시배열의 길이
		int[] reserve = new int[length];//임시배열
		
		int i=0;//임시배열의 원소를 저장할 지역변수
		int index1=start;//기존배열의 값을 조회하기 위한 인덱스 변수
		int index2=middle+1;//
		while(index1<=middle&&index2<=end) {//나누어진 두배열의 값들을 전부 조회하기 위한 조건
			if(array[index1]<array[index2])
				reserve[i++]=array[index1++];
			else
				reserve[i++]=array[index2++];
		}
		while(index1<=middle)//값 비교 중에 남아있을 수(ex:한 쪽 배열의 검사가 이미끝났을 때) 있는 값들을 다시 넣음
			reserve[i++]=array[index1++];
		while(index2<=end)
			reserve[i++]=array[index2++];
		
		for(i=0; i<reserve.length; i++) {
			array[start+i]=reserve[i];//정렬된 임시배열을 기존배열에 복사
		}
	}
}
