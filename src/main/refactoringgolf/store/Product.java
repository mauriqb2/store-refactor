package refactoringgolf.store;

public class Product {

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
		return "<product>" + "<name>" + name + "</name> </product>";
	}
	
	public float calculateDiscount(OrderItem item) {
		return item.getProduct().getUnitPrice() * item.getQuantity();
	} 
}
