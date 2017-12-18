
public class Order {
	
	int orderId, productId, quantity;

	public Order(int orderId, int productId, int quantity) {
		super();
		this.orderId = orderId;
		this.productId = productId;
		this.quantity = quantity;
	}
	
	@Override
	public boolean equals(Object arg) {
		Order ord=(Order)arg;
		if(this.orderId == ord.orderId && this.productId == ord.productId && this.quantity == ord.quantity) {
			return true;
		}
			return false;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	

}
