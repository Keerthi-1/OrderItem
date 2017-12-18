
public class ProductDBStore {
	
	Product[] p = new Product[5];

	public ProductDBStore() {
		p[0] = new Product(464, "phone", "iphone 8", 10, 800.00 );
		p[1] = new Product(561, "headset", "beats headset", 50, 200.00);
		p[2] = new Product(894, "laptop", "hp laptop", 12, 799.00);
		p[3] = new Product(210, "watch", "Fossil watch", 16, 139.99);
		p[4] = new Product(347, "TV", "smart TV", 32, 400.00);
	}

	public ProductDBStore(Product[] p) {
		super();
		this.p = p;
	}

	

	
	
	
	
	
	

}
