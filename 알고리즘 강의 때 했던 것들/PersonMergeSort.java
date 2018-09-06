/*Person형 배열 mergeSort 구현*/
package Study;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Person 김영곤 = new Person("김영곤",25);
		Person 전승익 = new Person("전승익",24);
		Person 홍준성 = new Person("홍준성",23);
		Person 이호석 = new Person("이호석",24);
		Person 김민섭 = new Person("김민섭",24);
		Person 김지연 = new Person("김지연",23);
		Person 조지연 = new Person("조지연",25);
		Person 김지원 = new Person("김지원",24);
		Person 정기혁 = new Person("정기혁",24);
		Person 정형일 = new Person("정형일",25);
		Person[] a = {김민섭,홍준성,김영곤,정형일,김지원,정기혁,김지연,이호석,전승익,조지연};
		
		mergeSort(a,0,a.length-1);
		for(int i=0;i<a.length; i++) {
			a[i].print();
		}
	}
	
	private static void mergeSort(Person[] a,int start,int end) {
		//종료조건 배열이 한개일때 리턴
		if(start<end) {
			int middle=(end+start)/2;
			
			mergeSort(a,start,middle);
			mergeSort(a,middle+1,end);
			merge(a,start,middle,end);
		}
	}
	
	private static void merge(Person[] a,int start,int middle,int end) {
		Person[] temp=new Person[end-start+1];
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
			a[i+start]=temp[i];
		}
	}
}

class Person implements Comparable{//Comparable 인터페이스를 구현한 Person
	String name;
	int age;
	
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	@Override
	public int compareTo(Object o) {//다른객체를 받아와서
		Person other=(Person)o;//Person형변환 한뒤
		if(this.age<other.age) return -1;//나이를 먼저비교하고
		else if(this.age>other.age) return 1;
		else {//나이가 같으면 이름을 비교한다
			if(this.name.compareTo(other.name)<0) return -1;
			else if(this.name.compareTo(other.name)>0) return 1;
		}
		return 0;
	}
	
	public void print() {
		System.out.print(this.name+" "+this.age+" ");
	}
}
