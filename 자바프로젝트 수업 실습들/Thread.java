/* SharedObject 클래스를 구현하라.
 * sum 멤버 변수
 * add 메소드: 파라미터 값을 sum 변수에 더하기
 * sub 메소드: 파라미터 값을 sum 변수에서 빼기
 * 스레드를 두 개 만들라.
 * 두 스레드가 SharedObject 객체 하나를 공유하라.
 * 스레드 하나는 SharedObject 객체의 add 메소드를 호출하여 1부터 100까지 값을 더하라.
 * 다른 스레드는 SharedObject 객체의 sub 메소드를 호출하여 1부터 100까지 값을 빼라.
 * 두 스레드가 종료한 뒤, SharedObject 객체의 sum 변수 값이 0 임을 확인하라.
 * */

public class Main {
	private static SharedObject obj = new SharedObject();
	
    public static void main(String[] args) {
    	Thread thread1 = new Thread() {
    		@Override
    		public void run() {
    			for(int i=0; i<100; i++) {
    				obj.add(1);
        			System.out.println("Thread1:"+(i+1)+"번째: obj.sum = "+obj.sum);
        			try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
    			}
    		}
    	};
    	Thread thread2 = new Thread(){
    		@Override
    		public void run() {
    			for(int i=0; i<100; i++) {
    				obj.sub(1);
        			System.out.println("Thread2:"+(i+1)+"번째: obj.sum = "+obj.sum);
        			try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
    			}
    		}
    	};
    	
    	thread1.start();
    	thread2.start();
    }
}

class SharedObject{
	int sum;
	
	synchronized public void add(int value) {
		sum+=value;
	}
	
	synchronized public void sub(int value) {
		sum-=value;
	}
}
