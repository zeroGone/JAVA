package exam1;

import java.util.Arrays;

public class Exam11 {
	public static void main(String[] args) {
        Product[] a = new Product[] {
            new Product(1, "����", 3000),
            new Product(2, "����", 2000),
            new Product(3, "����", 3000),
            new Product(4, "���ɸ�", 1000),
            new Product(5, "����", 2000)
        };

        Arrays.sort(a, new ProductComparator());
        for (Product p : a)
            System.out.println(p);
    }
}
