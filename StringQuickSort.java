import java.util.Arrays;

/*String형 배열 quciksort 구현*/
public class Main {
	public static void main(String[] args) throws Exception {
		String[] a = { "zero", "one", "two", "three", "four", "five", "six", "seven" };
		quickSort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
	}
	
	private static void quickSort(String[] a,int start,int end) {
		if(start<end) {
			int middle=partition(a,start,end);
			quickSort(a,start,middle-1);
			quickSort(a,middle+1,end);
		}
	}
	
	private static int partition(String[] a,int start,int end) {
		String value=a[end];
		int i=start-1;
		for(int j=start; j<end; j++) {
			if(a[j].compareTo(value)<0) {
				i++;
				if(i!=j) swap(a,i,j);
			}
		}
		swap(a,++i,end);
		return i;
	}
	
	private static void swap(String[] a,int i,int j) {
		String reserve = a[i];
		a[i]=a[j];
		a[j]=reserve;
	}
}