package refactoringgolf.store;

public class ProductBikes {

	public float calculateDiscount(OrderItem item) {
		float itemAmount = item.getProduct().getUnitPrice() * item.getQuantity();
		return itemAmount - itemAmount * 20 / 100;
	}
}