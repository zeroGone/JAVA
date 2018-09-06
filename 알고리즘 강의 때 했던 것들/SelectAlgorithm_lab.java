/*int형 배열의 i번째 작은값 찾기 구현 */
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		int[] a = { 31,8,48,73,11,3,20,29,65,15 };
		
		Scanner input = new Scanner(System.in);
		System.out.print("몇번째 최소값?");
		int index = input.nextInt();
		quickSort(a,0,a.length-1);
		System.out.print(a[index]);
	}
	
	public static void quickSort(int[] a,int start,int end) {
		if(start>=end) return;
		int middle=partition(a,start,end);
		quickSort(a,start,middle-1);
		quickSort(a,middle+1,end);
	}
	
	private static int partition(int[] a,int start,int end) {
		int value=a[end];
		int i=start-1;
		for(int j=start; j<end; j++) {
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