/* SharedObject Ŭ������ �����϶�.
 * sum ��� ����
 * add �޼ҵ�: �Ķ���� ���� sum ������ ���ϱ�
 * sub �޼ҵ�: �Ķ���� ���� sum �������� ����
 * �����带 �� �� �����.
 * �� �����尡 SharedObject ��ü �ϳ��� �����϶�.
 * ������ �ϳ��� SharedObject ��ü�� add �޼ҵ带 ȣ���Ͽ� 1���� 100���� ���� ���϶�.
 * �ٸ� ������� SharedObject ��ü�� sub �޼ҵ带 ȣ���Ͽ� 1���� 100���� ���� ����.
 * �� �����尡 ������ ��, SharedObject ��ü�� sum ���� ���� 0 ���� Ȯ���϶�.
 * */

public class Main {
	private static SharedObject obj = new SharedObject();
	
    public static void main(String[] args) {
    	Thread thread1 = new Thread() {
    		@Override
    		public void run() {
    			for(int i=0; i<100; i++) {
    				obj.add(1);
        			System.out.println("Thread1:"+(i+1)+"��°: obj.sum = "+obj.sum);
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
        			System.out.println("Thread2:"+(i+1)+"��°: obj.sum = "+obj.sum);
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
