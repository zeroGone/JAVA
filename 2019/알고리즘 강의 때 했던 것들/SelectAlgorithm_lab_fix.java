/*int형 배열의 i번째 작은값 찾기 구현 */
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		int[] a = { 31,8,48,73,11,3,20,29,65,15 };
		
		Scanner input = new Scanner(System.in);
		System.out.print("몇번째 최소값?");
		int index = input.nextInt();
		
		System.out.print(select(a,0,a.length-1,index));
	}
	
	public static int select(int[] a,int start,int end, int nth) {
		if(start>=end) return a[start];//종료조건 배열이 하나일 경우 그 배열의 원소값을 리턴
		
		int middle=partion(a,start,end);//partion 메소드를 실행하여 중간값을 받아옴
		int i=middle-start+1;
		//partion한 위치의 값이 자기가 속한 배열의 위치를 i에 저장
		//예를들어 3~6배열의 partion한 값의 인덱스가 5이면  5-3+1=3
		//속한 배열에서 3번째로 작은 값이다.
		
		if(i==nth) return a[middle];
		//i와 찾는 값이 같으면 찾은거이므로  middle의 값을 리턴
		if (nth<i) return select(a, start, middle - 1, nth);//앞부분에서 재귀
		else
			return select(a, middle + 1, end, nth - i);//뒷부분에서재귀
	}
	
	private static int partion(int[] a,int start,int end) {
		int value=a[end];
		int i=start-1;
		for(int j=start; j<=end-1; j++) {
			if(i!=j) {
				if(a[j]<value) swap(a,++i,j);
			}
		}
		swap(a,i+1,end);
		return i+1;
	}
	
	private static void swap(int[] a,int i,int j) {
		int reserve=a[i];
		a[i]=a[j];
		a[j]=reserve;
	}
}