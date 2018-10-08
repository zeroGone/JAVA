/* upcasting
 * 객체를 받는 변수가 부모고 객체가 자식이면
 * upcasting되어 부모가 가지고 있는 메소드만 쓸 수 있다
 * 밑에 사례는 객체의 toString메소드들이 오버라이드되어서 
 * upcasting된 부모의 메소드를 자식메소드로 실행시킨다.
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
    	System.out.println(o1);//배열의 주소값나옴
    	o1 = new String[] { "one", "two", "three" };
    	System.out.println(o1);
    }

}

