/*Person�� �迭 mergeSort ����*/
package Study;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Person �迵�� = new Person("�迵��",25);
		Person ������ = new Person("������",24);
		Person ȫ�ؼ� = new Person("ȫ�ؼ�",23);
		Person ��ȣ�� = new Person("��ȣ��",24);
		Person ��μ� = new Person("��μ�",24);
		Person ������ = new Person("������",23);
		Person ������ = new Person("������",25);
		Person ������ = new Person("������",24);
		Person ������ = new Person("������",24);
		Person ������ = new Person("������",25);
		Person[] a = {��μ�,ȫ�ؼ�,�迵��,������,������,������,������,��ȣ��,������,������};
		
		mergeSort(a,0,a.length-1);
		for(int i=0;i<a.length; i++) {
			a[i].print();
		}
	}
	
	private static void mergeSort(Person[] a,int start,int end) {
		//�������� �迭�� �Ѱ��϶� ����
		if(start<end) {
			int middle=(end+start)/2;
			
			mergeSort(a,start,middle);
			mergeSort(a,middle+1,end);
			merge(a,start,middle,end);
		}
	}
	
	private static void merge(Person[] a,int start,int middle,int end) {
		Person[] temp=new Person[end-start+1];
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
			a[i+start]=temp[i];
		}
	}
}

class Person implements Comparable{//Comparable �������̽��� ������ Person
	String name;
	int age;
	
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	@Override
	public int compareTo(Object o) {//�ٸ���ü�� �޾ƿͼ�
		Person other=(Person)o;//Person����ȯ �ѵ�
		if(this.age<other.age) return -1;//���̸� �������ϰ�
		else if(this.age>other.age) return 1;
		else {//���̰� ������ �̸��� ���Ѵ�
			if(this.name.compareTo(other.name)<0) return -1;
			else if(this.name.compareTo(other.name)>0) return 1;
		}
		return 0;
	}
	
	public void print() {
		System.out.print(this.name+" "+this.age+" ");
	}
}
