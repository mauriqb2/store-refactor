package refactoringgolf.store;

public class ProductBikes extends Product {
	
	private String categoryName = "Bikes";

	public ProductBikes(String name, float unitPrice, ImageInfo image) {
		super(name, unitPrice, image);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calculateDiscount(OrderItem item) {
		float itemAmount = item.getProduct().getUnitPrice() * item.getQuantity();
		return itemAmount - itemAmount * 20 / 100;
	}
	
	@Override
	public String toXml() {
		return "<product>" + "<name>" + name + "</name>" + "<category>"
				+ categoryName + "</category>" + "</product>";
	}
}