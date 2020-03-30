public class Main {
	static Object[] values;
	
	static void addData(int count) {
		/*배열에 0 부터 count-1 까지 정수를 넣어라.
		정수 하나를 배열에 넣을 때, Integer 객체 하나와 String 객체 하나를 넣어라.
		( 예: new Integer(3), String.valueOf(3) )
		즉 정수 하나에 객체 두 개를 배열에 넣는다.
		따라서 배열의 크기는 count * 2 이어야 한다.
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