/* upcasting
 * ��ü�� �޴� ������ �θ�� ��ü�� �ڽ��̸�
 * upcasting�Ǿ� �θ� ������ �ִ� �޼ҵ常 �� �� �ִ�
 * �ؿ� ��ʴ� ��ü�� toString�޼ҵ���� �������̵�Ǿ 
 * upcasting�� �θ��� �޼ҵ带 �ڽĸ޼ҵ�� �����Ų��.
 * */
import java.util.Date;
public class Main {
    public static void main(String[] args) {
    	Object o1 = new String("hello");
    	System.out.println(o1);
    	o1 = new Date();
    	System.out.println(o1);
    	o1 = new StringBuilder();
    	System.out.println(o1);
    	o1 = new Integer(3);
    	System.out.println(o1);
    	o1 = new int[] { 1, 2, 3 };
    	System.out.println(o1);//�迭�� �ּҰ�����
    	o1 = new String[] { "one", "two", "three" };
    	System.out.println(o1);
    }

}

