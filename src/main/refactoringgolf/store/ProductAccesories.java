package refactoringgolf.store;

public class ProductAccesories extends Product{

	public ProductAccesories(String name, float unitPrice, ImageInfo image) {
		super(name, unitPrice, image);
		categoryName = "Accesories";
	}

	@Override
	public float calculateTotalFor(int quantity) {
		float itemAmount = unitPrice * quantity;
		return itemAmount - getDiscount(itemAmount);
	}

	private float getDiscount(float itemAmount) {
		float booksDiscount = 0;
		if (itemAmount >= 100) {
			booksDiscount = itemAmount * 10 / 100;
		}
		return booksDiscount;
	}
}