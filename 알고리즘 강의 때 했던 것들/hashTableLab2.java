/* 해시테이블 구현 실습
 * int 값 뿐만 아니라 아무 객체나 저장할 수 있도록
 * 더블해싱과 multiplication 방법으로 구현
 * */

import java.util.Objects;

public class Main {

	static class HashTable {
		static final Object EMPTY = null;
		static final double A = 0.3758;
		static final int[] PRIME_NUMBER = {3, 5, 7, 11, 13, 17, 19 };

		Object[] a;//객체 담을 배열
		int count;//객체 개수
		int threshold;//해시 값 

		public HashTable() {//생성자
			this(32);
		}

		public HashTable(int size) {//생성자
			this.a = new Object[size];
			this.threshold = (int)(this.a.length * 0.7);
		}

		private void resize() {
			int newSize = a.length * 2;
			HashTable newHashTable = new HashTable(newSize);
			for (Object value : a)
				if (value!=null)
					newHashTable.add(value);
			this.a = newHashTable.a;
			this.threshold = newHashTable.threshold;
		}

		public void add(Object value) {
			int collisionCount = 0;
			do {
				int index = getIndex(value, collisionCount);
				if (a[index] == EMPTY) {
					a[index] = value;
					this.count++;
					if (this.count >= this.threshold) resize();
					return;
				} else if (a[index].equals(value))
					return;
				++collisionCount;
			} while (collisionCount < a.length);
		}

		private int getIndex(Object value, int collisionCount) {
			int startIndex = (int)(((value.hashCode() * A) % 1) * this.a.length);
			int step = PRIME_NUMBER[value.hashCode() % 7];
			return (startIndex + collisionCount * step) % a.length;
		}

		public void remove(Object value) {
			int collisionCount = 0;
			do {
				int index = getIndex(value, collisionCount);
				if (a[index] == EMPTY) return;
				else if (a[index].equals(value)) {
					a[index] = EMPTY;
					this.count--;
					return;
				}
				++collisionCount;
			} while (collisionCount < a.length);
		}

		public boolean contains(Object value) {
			int collisionCount = 0;
			do {
				int index = getIndex(value, collisionCount);
				if (a[index] == EMPTY) return false;
				else if (a[index].equals(value)) return true;
				++collisionCount;
			} while (collisionCount < a.length);
			return false;
		}
	}

	public static void main(String[] args) throws Exception {
		Person[] a = new Person[] { 
				new Person("홍길동", 18), 
				new Person("임꺽정", 22), 
				new Person("전우치", 23) 
		};
		
		HashTable hashTable = new HashTable();

		for (Person person : a) 
			hashTable.add(person); 
		for (Person person : a) 
			System.out.println(hashTable.contains(person)); 
		
		System.out.println(hashTable.contains(new Person("임꺽정",22))); 
		System.out.println(hashTable.contains(new Person("연흥부", 30)));
	}
}

class Person{
	String name;
	int age;
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name,age);
	}
	
	@Override
	public boolean equals(Object obj) {
		Person other = (Person)obj;
		if(this.name.equals(other.name)&&this.age==other.age) return true;
		return false;
		
	}
}
