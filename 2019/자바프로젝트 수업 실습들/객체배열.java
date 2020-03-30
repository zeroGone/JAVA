public class Main {
	static Object[] values;
	
	static void addData(int count) {
		/*�迭�� 0 ���� count-1 ���� ������ �־��.
		���� �ϳ��� �迭�� ���� ��, Integer ��ü �ϳ��� String ��ü �ϳ��� �־��.
		( ��: new Integer(3), String.valueOf(3) )
		�� ���� �ϳ��� ��ü �� ���� �迭�� �ִ´�.
		���� �迭�� ũ��� count * 2 �̾�� �Ѵ�.
		*/
		values = new Object[count*2];
		int value = 0;
		for(int i=0; i<values.length; i+=2) {
			values[i]=new Integer(value);
			values[i+1]=String.valueOf(value);
			value++;
		}
	}
	
	static int findIndex(int value) {
		for(int i=0; i<values.length; i++)
			if(values[i].equals(value)) return i;
		return -1;
	}
	
	static int findIndex(String value) {
		for(int i=0; i<values.length; i++)
			if(value.equals(values[i])) return i;
		return -1;
	}
	
    public static void main(String[] args) {
    	addData(3);
    	System.out.println(findIndex(0));
    	System.out.println(findIndex("0"));
    }
}