package refactoringgolf.store;

public class ProductCloathing extends Product {

	public ProductCloathing(String name, float unitPrice, ImageInfo image) {
		super(name, unitPrice, image);
		categoryName = "Cloathing";
	}

	@Override
	public float calculateTotalFor(int quantity) {
		float itemAmount = unitPrice * quantity;
		return itemAmount - getDiscount(quantity);
	}

	private float getDiscount(int quantity) {
		float cloathingDiscount = 0;
		if (quantity > 2) {
			cloathingDiscount = unitPrice;
		}
		return cloathingDiscount;
	}
	
}
