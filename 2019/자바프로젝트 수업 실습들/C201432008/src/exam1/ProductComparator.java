package exam1;

import java.util.Comparator;

public class ProductComparator implements Comparator {

	@Override
	public int compare(Object arg0, Object arg1) {
		Product product1 = (Product)arg0;
		Product product2 = (Product)arg1;
		if(product1.name.compareTo(product2.name)>0) return 1;
		else if(product1.name.compareTo(product2.name)<0) return -1;
		if(product1.price>product2.price) return 1;
		else if(product1.price<product2.price) return -1;
		if(product1.id>product2.id) return 1;
		else if(product1.id<product2.id) return -1;
		return 0;
	}

}
