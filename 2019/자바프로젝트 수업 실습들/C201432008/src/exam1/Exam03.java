package exam1;

public class Exam03 {

	public static void main(String[] args) {
		Object[] a = new Person[2];
		Object[] b = a;
		
		a[0]= new Person("ȫ�浿","201132050",2,4.1);
		a[1]=a[0];
		
		System.out.println(a == b);
		System.out.println(a[0] == b[1]);
		System.out.println(a[0].equals(b[1]));
	}

}
