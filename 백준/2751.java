/*  2751번 수 정렬하기2
 *  간단해보이지만 수들이 커짐에따라
 *  고급정렬을 써야하는 문제
 *  병합문제로 해결.
 *  
 *  N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 *	입력:
 * 	첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000,000)이 주어진다.
 *  둘째 줄부터 N개의 줄에는 숫자가 주어진다. 
 *  이 수는 절대값이 1,000,000보다 작거나 같은 정수이다. 
 *  수는 중복되지 않는다.
 *  
 *  출력:
 *  첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
 * */

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		
		int[] array =new int[N];
		
		for(int i=0; i<array.length; i++) array[i]=input.nextInt();
		
		mergeSort(array,0,array.length-1);
		
		for(int i=0; i<array.length; i++) System.out.println(array[i]);

	}
	
	private static void mergeSort(int[] a,int start,int end) {
		if(start<end) {
			int middle=(start+end)/2;
			mergeSort(a,start,middle);
			mergeSort(a,middle+1,end);
			merge(a,start,middle,end);
		}
	}
	
	private static void merge(int[] a,int start,int middle,int end) {
		int[] temp = new int[end-start+1];
		int i=0;
		int index1=start;
		int index2=middle+1;
		
		while(index1<=middle&&index2<=end) {
			if(a[index1]<a[index2]) temp[i++]=a[index1++];
			else temp[i++]=a[index2++];
		}
		
		while(index1<=middle) temp[i++]=a[index1++];
		while(index2<=end) temp[i++]=a[index2++];
		
		for(i=0; i<temp.length; i++) a[start+i]=temp[i];
	}
	
}