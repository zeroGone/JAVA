
public class Main {

	public static void main(String[] args) {
		//�޼ҵ� �Ķ���ͷ� ������ �����ص�
		//������ �����ϴ� ���� �ƴ϶� ������ ���� �����ϹǷ� a�� �ٲ�������
		//call by value ����
		int a = 3;
		method1(a);
		System.out.println(a);

		//������ ��ü�� ������ ���
		//��ü�� ���޵Ǳ� ������ ���� �ٲ��.
		//call by reference
		Person p = new Person();
		p.age = 3;
		method2(p);
		System.out.println(p.age);

		//String Ŭ������ Ư���� Ŭ������ �⺻�ڷ���ó�� ����.
		String s = "hello";
		method3(s);
		System.out.println(s);
		
		String s1 = "hello";
	    String s2 = "HELLO";
	    String s3 = s2.toLowerCase();

	    //==�� �����ϴ°��� ������ ����
	    System.out.println(s1 == s3);
	    //equals�޼ҵ�� ������ ����������
	    System.out.println(s1.equals(s3)); // (��)
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