package refactoringgolf.store;

public class Product {
	
	/* Category */
	public String categoryName = "none";

	/* The Name */
	public String name;

	/* The UnitPrice */
	public float unitPrice;

	/* The Image */
	public ImageInfo image;

	/* The Category */
	public int unitsInStock;

	public Product(String name, float unitPrice, ImageInfo image) {
		this.name = name;
		this.unitPrice = unitPrice;
		this.image = image;
	}

	public String getName() {
		return name;
	}

	public float getUnitPrice() {
		return unitPrice;
	}

	public ImageInfo getImage() {
		return image;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	public String toXml() {
		return "<product>" + "<name>" + name + "</name>" + "<category>"
				+ categoryName + "</category>" + "</product>";
	}
	
	public float calculateTotalFor(int quantity) {
		return unitPrice * quantity;
	} 
}
