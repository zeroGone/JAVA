/*���� ���� �޸� ������ ����� ������ �Ʒ� �ڵ带 �ϼ��϶�.*/
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
