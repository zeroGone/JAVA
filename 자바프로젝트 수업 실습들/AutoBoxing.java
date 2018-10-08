/* auto boxing
 * Object 변수에 객체를 생성해서 넣어야하지만
 * 기본자료형의 경우 자바에선 AutoBoxing을 지원하여
 * 알아서 객체를 생성해준다.
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

