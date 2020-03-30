/* InnerClass Ŭ������ swap �޼ҵ� ����
 * */

public class Main {

    int a = 3, b = 4;

    void doSomethoing() {
        new InnerClass().swap();
        System.out.printf("%d %d\n", a, b);
    }

    public static void main(String[] args) {
        new Main().doSomethoing();
    }
    
    class InnerClass{
    	public void swap() {
    		int c=a;
    		a=b;
    		b=c;
    	}
    }
}
