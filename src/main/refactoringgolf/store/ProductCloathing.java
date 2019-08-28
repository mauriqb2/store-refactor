package refactoringgolf.store;

public class ProductCloathing extends Product {
	
	private String categoryName = "Cloathing";

	public ProductCloathing(String name, float unitPrice, ImageInfo image) {
		super(name, unitPrice, image);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calculateDiscount(OrderItem item) {
		float itemAmount = item.getProduct().getUnitPrice() * item.getQuantity();
		float cloathingDiscount = 0;
		if (item.getQuantity() > 2) {
			cloathingDiscount = item.getProduct().getUnitPrice();
		}
		return itemAmount - cloathingDiscount;
	}
	
	@Override
	public String toXml() {
		return "<product>" + "<name>" + name + "</name>" + "<category>"
				+ categoryName + "</category>" + "</product>";
	}
	
}
