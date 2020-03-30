import java.util.Arrays;

/* 정렬의 기준이 한 개인 경우, 그 클래스의 compareTo 메소드 구현
 * 정렬의 기준이 여러 개인 경우, Compartor 비교 클래스를 따로 구현해 비교한다.
 * 내림차순으로 정렬
 * */

public class Main{

	public static void main(String[] args) {
        int[] a = { 17, 14, 11, 19, 13, 15, 20, 12, 16, 18 };
        double[] b = { 17.1, 14.3, 11.2, 19.5, 11.3, 14.1, 17.5, 19.2 };
        String[] c = { "zero", "one", "two", "three", "four", "five", "six", "seven" };
        Integer[] d = { 17, 14, 11, 19, 13, 15, 20, 12, 16, 18 };
        Person[] e = new Person[] {
                new Person("홍길동", 18),
                new Person("임꺽정", 22),
                new Person("전우치", 23),
                new Person("김영곤",18)
        };
        
        //기본자료형 배열 내림차순
        //기본자료형 배열 같은 경우 Compartor를 쓸 수 없기 때문에
        //복사한 배열을 만들어 하나씩 뒤집어준다
        Arrays.sort(a);
        Arrays.sort(b);
        int[] a2 = new int[a.length];
        double[] b2 = new double[b.length];
        for(int i=0; i<a.length; i++) a2[i]=a[i]; 
        for(int i=0; i<b.length; i++) b2[i]=b[i]; 

        int index = a.length-1;
        for(int i=0; i<a.length; i++) a[i]=a2[index--];
        index = b.length-1;
        for(int i=0; i<b.length; i++) b[i]=b2[index--];

        //내림차순
        Arrays.sort(c, (String o1, String o2)->{return o2.compareTo(o1);});
        Arrays.sort(d, (Integer o1,Integer o2)->{return o2-o1;});
        Arrays.sort(e, (Person p1, Person p2)->{return p1.compareTo(p2);});
        
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(d));
        System.out.println(Arrays.toString(e));

	}
}


class Person implements Comparable<Person>{
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}

	@Override
	public String toString() {
		return name+"/"+Integer.toString(age);
	}
	
	@Override
	public boolean equals(Object obj) {
		Person other = (Person)obj;
		if(name.equals(other.name)&&age==other.age) return true;
		return false;
	}
	
	@Override
	public int compareTo(Person o) {
		if(this.age!=o.age) return o.age-this.age;
		return o.name.compareTo(this.name);
	}
}
