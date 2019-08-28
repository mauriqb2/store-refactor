package refactoringgolf.store;

public class ProductAccesories{
	private float booksDiscount = 0;
	
	public float calculateDiscount(float itemAmount) {
		if (itemAmount >= 100) {
			booksDiscount = itemAmount * 10 / 100;
		}
		return itemAmount - booksDiscount;
	}
}