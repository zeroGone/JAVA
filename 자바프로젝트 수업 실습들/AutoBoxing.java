/* auto boxing
 * Object ������ ��ü�� �����ؼ� �־��������
 * �⺻�ڷ����� ��� �ڹٿ��� AutoBoxing�� �����Ͽ�
 * �˾Ƽ� ��ü�� �������ش�.
 * */
import java.util.Date;
public class Main {
    public static void main(String[] args) {
    	Object o1 = 3;//==new Integer(3) 
    	System.out.println(o1);
    	o1 = 3.14;//==new Double(3.14) 
    	System.out.println(o1);
    }

}

