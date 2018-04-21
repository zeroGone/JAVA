/*Person�� �迭 quciksort ����*/
import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws Exception {
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
		
		quickSort(a,0,a.length-1);
		for(int i=0;i<a.length; i++) {
			a[i].print();
		}
	}
	
	private static void quickSort(Person[] a,int start,int end) {
		if(start<end) {
			int middle=partition(a,start,end);
			quickSort(a,start,middle-1);
			quickSort(a,middle+1,end);
		}
	}
	
	private static int partition(Person[] a,int start,int end) {
		Person value=a[end];
		int i=start-1;
		for(int j=start; j<end; j++) {
			if(a[j].compareTo(value)<0) {
				i++;
				if(i!=j) swap(a,i,j);
			}
		}
		swap(a,++i,end);
		return i;
	}
	
	private static void swap(Person[] a,int i,int j) {
		Person reserve = a[i];
		a[i]=a[j];
		a[j]=reserve;
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