package refactoringgolf.store;

public class ProductAccesories extends Product{
	
	private String categoryName = "Accesories";
	
	public ProductAccesories(String name, float unitPrice, ImageInfo image) {
		super(name, unitPrice, image);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calculateDiscount(OrderItem item) {
		float itemAmount = item.getProduct().getUnitPrice() * item.getQuantity();
		float booksDiscount = 0;
		if (itemAmount >= 100) {
			booksDiscount = itemAmount * 10 / 100;
		}
		return itemAmount - booksDiscount;
	}
	
	@Override
	public String toXml() {
		return "<product>" + "<name>" + name + "</name>" + "<category>"
				+ categoryName + "</category>" + "</product>";
	}
}