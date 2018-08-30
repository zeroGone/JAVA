/*  2751�� �� �����ϱ�2
 *  �����غ������� ������ Ŀ��������
 *  ��������� ����ϴ� ����
 *  ���չ����� �ذ�.
 *  
 *  N���� ���� �־����� ��, �̸� ������������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *	�Է�:
 * 	ù° �ٿ� ���� ���� N(1 �� N �� 1,000,000)�� �־�����.
 *  ��° �ٺ��� N���� �ٿ��� ���ڰ� �־�����. 
 *  �� ���� ���밪�� 1,000,000���� �۰ų� ���� �����̴�. 
 *  ���� �ߺ����� �ʴ´�.
 *  
 *  ���:
 *  ù° �ٺ��� N���� �ٿ� ������������ ������ ����� �� �ٿ� �ϳ��� ����Ѵ�.
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