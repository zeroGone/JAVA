/*Person형 배열 quciksort 구현*/
import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws Exception {
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