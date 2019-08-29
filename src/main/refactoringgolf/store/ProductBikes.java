package refactoringgolf.store;

public class ProductBikes extends Product {
	
	public ProductBikes(String name, float unitPrice, ImageInfo image) {
		super(name, unitPrice, image);
		categoryName = "Bikes";
	}

	@Override
	public float calculateTotalFor(int quantity) {
		float itemAmount = unitPrice * quantity;
		return itemAmount - getDiscount(itemAmount);
	}

	private float getDiscount(float itemAmount) {
		return itemAmount * 20 / 100;
	}
}