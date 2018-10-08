package exam1;

import java.util.Arrays;

public class Exam11 {
	public static void main(String[] args) {
        Product[] a = new Product[] {
            new Product(1, "钙林", 3000),
            new Product(2, "钙林", 2000),
            new Product(3, "钙林", 3000),
            new Product(4, "阜吧府", 1000),
            new Product(5, "家林", 2000)
        };

        Arrays.sort(a, new ProductComparator());
        for (Product p : a)
            System.out.println(p);
    }
}
