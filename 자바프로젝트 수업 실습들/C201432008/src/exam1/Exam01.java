package exam1;

public class Exam01 {

	public static void main(String[] args) {
		Person p1 = new Person("ȫ�浿", "201132050", 2, 4.1);
		Person p2 = new Person("ȫ�浿", null, 2, 4.1);
		Person p3 = new Person("ȫ�浿", "201132050", 2, 4.1);
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
	}
}
