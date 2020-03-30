
public class Main {

	public static void main(String[] args) {
		//메소드 파라미터로 변수를 전달해도
		//변수를 전달하는 것이 아니라 변수의 값만 전달하므로 a는 바뀌지않음
		//call by value 형식
		int a = 3;
		method1(a);
		System.out.println(a);

		//하지만 객체를 전달할 경우
		//객체가 전달되기 때문에 값이 바뀐다.
		//call by reference
		Person p = new Person();
		p.age = 3;
		method2(p);
		System.out.println(p.age);

		//String 클래스는 특별한 클래스로 기본자료형처럼 쓰임.
		String s = "hello";
		method3(s);
		System.out.println(s);
		
		String s1 = "hello";
	    String s2 = "HELLO";
	    String s3 = s2.toLowerCase();

	    //==은 참조하는것이 같은지 비교함
	    System.out.println(s1 == s3);
	    //equals메소드는 내용이 같은지비교함
	    System.out.println(s1.equals(s3)); // (나)
	}
	
	private static void method1(int a) {
		a = 5;
	}
	
	private static void method2(Person p) {
		p.age=5;
	}
	
	private static void method3(String s) {
		s="bye";
	}
}

class Person{
	int age;
}