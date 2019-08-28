package refactoringgolf.store;

public class ProductCloathing extends Product {
	
	private String categoryName = "Cloathing";

	public ProductCloathing(String name, float unitPrice, ImageInfo image) {
		super(name, unitPrice, image);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calculateDiscount(int quantity) {
		float itemAmount = unitPrice * quantity;
		float cloathingDiscount = 0;
		if (quantity > 2) {
			cloathingDiscount = unitPrice;
		}
		return itemAmount - cloathingDiscount;
	}
	
	@Override
	public String toXml() {
		return "<product>" + "<name>" + name + "</name>" + "<category>"
				+ categoryName + "</category>" + "</product>";
	}
	
}
