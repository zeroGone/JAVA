/*위와 같은 메모리 구조가 만들어 지도록 아래 코드를 완성하라.*/
public class Main {

	public static void main(String[] args) {
		Data[] a = new Data[3];
		
		a[0] = new Data(new int[] {1,2,3});
		a[1] = new Data(new Integer[] {1,2,3});
		a[2] = new Data("hello");
	}
}
class Data {
	Object obj;
	public Data(Object obj) {
		this.obj = obj;
	}
}
