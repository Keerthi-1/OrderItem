
public class OrderService {
	
	ProductDBStore productDBStore = new ProductDBStore();
	
	public void processOrder(Order order) {

		int pid;
		int orderQ;
		int updateQ;
		
		pid = order.getProductId();
		System.out.println("pid is:"+pid);
		
		orderQ = order.getQuantity();
		System.out.println("Quantity ordered is:"+orderQ);
		
		for(int i=0;i<productDBStore.p.length;i++) {
			Product product= productDBStore.p[i];
			
			if(product.getId()==pid) {
				if(orderQ<=product.getQuantity()) {
					
					System.out.println("Order is processed");
					
					updateQ = product.getQuantity() - orderQ;
					product.setQuantity(updateQ);
					System.out.println("Updated Quantity is: "+product.getQuantity());
										
				}else
					System.err.println("Out of Stock");
			}
		}
	
	}
	
}