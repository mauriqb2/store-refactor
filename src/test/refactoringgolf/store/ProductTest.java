package refactoringgolf.store;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import refactoringgolf.store.ImageInfo;
import refactoringgolf.store.Product;

public class ProductTest {

	@Test
	public void productImageReturnTheType() {
		ImageInfo imageInfo = new ImageInfo("Bike01.jpg");

		String type = imageInfo.getImageType();

		assertEquals("jpg", type);
	}

	@Test
	public void serializeToXml() {
		Product product = createProduct();

		String xml = product.toXml();

		assertEquals("<product><name>Black Bike</name><category>Bikes</category></product>", xml);
	}

	private Product createProduct() {
		return new ProductBikes("Black Bike", 250, new ImageInfo("Bike01.jpg"));
	}
}
