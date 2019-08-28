package refactoringgolf.store;

public class ProductBikes {
	private float bikesDiscount = 20; //Percent

	public ProductBikes() {
	}
	
	public float calculateDiscount(float itemAmount) {
		return itemAmount - itemAmount * bikesDiscount / 100;
	}
}