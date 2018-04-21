/*String�� �迭 mergeSort ����*/
package Study;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		String[] a = { "zero", "one", "two", "three", "four", "five", "six", "seven" };
		mergeSort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
	}
	
	private static void mergeSort(String[] a,int start,int end) {
		//�������� �迭�� �Ѱ��϶� ����
		if(start<end) {
			int middle=(end+start)/2;
			mergeSort(a,start,middle);
			mergeSort(a,middle+1,end);
			merge(a,start,middle,end);
		}
	}
	
	private static void merge(String[] a,int start,int middle,int end) {
		String[] temp=new String[end-start+1];
		int i=0;//�ӽù迭 �ε���
		int index1=start;
		int index2=middle+1;
		while(index1<=middle&&index2<=end) {
			//index1�� index2 ��ġ�� ���ڿ��� ���� index1�� ���� ������ �ӽù迭�� �ִ´�
			if(a[index1].compareTo(a[index2])<0) temp[i++]=a[index1++];
			else temp[i++]=a[index2++];
		}
		//�����迭�� ���ҵ��� �ӽù迭�� �ִ´�
		while(index1<=middle) {
			temp[i++]=a[index1++];
		}
		while(index2<=end) {
			temp[i++]=a[index2++];
		}
		//�ӽù迭�� ���迭�� ����
		for(i=0; i<temp.length; i++) {
			a[start+i]=temp[i];
		}
	}
	
}
