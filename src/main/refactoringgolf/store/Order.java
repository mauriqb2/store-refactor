package refactoringgolf.store;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Order {

	public Customer customer;
	public Salesman salesman;
	public Date orderedOn;
	public String deliveryStreet;
	public String deliveryCity;
	public String deliveryCountry;
	public Set<OrderItem> items;

	public Order(Customer customer, Salesman salesman, String deliveryStreet, String deliveryCity, String deliveryCountry, Date orderedOn) {
		this.customer = customer;
		this.salesman = salesman;
		this.deliveryStreet = deliveryStreet;
		this.deliveryCity = deliveryCity;
		this.deliveryCountry = deliveryCountry;
		this.orderedOn = orderedOn;
		this.items = new HashSet<OrderItem>();
	}

	public Customer getCustomer() {
		return customer;
	}

	public Salesman getSalesman() {
		return salesman;
	}

	public Date getOrderedOn() {
		return orderedOn;
	}

	public String getDeliveryStreet() {
		return deliveryStreet;
	}

	public String getDeliveryCity() {
		return deliveryCity;
	}

	public String getDeliveryCountry() {
		return deliveryCountry;
	}

	public Set<OrderItem> getItems() {
		return items;
	}

	public float total() {
		float totalItems = 0;
		for (OrderItem item : items) {
			float totalItem=0;
			
			if (item.getProduct().getCategory() == ProductCategory.Accessories) {
				ProductAccesories productAccesories = new ProductAccesories();
				totalItem = productAccesories.calculateDiscount(item);
			}
			if (item.getProduct().getCategory() == ProductCategory.Bikes) {
				ProductBikes productAccesories = new ProductBikes();
				totalItem = productAccesories.calculateDiscount(item);
			}
			if (item.getProduct().getCategory() == ProductCategory.Cloathing) {
				ProductCloathing productAccesories = new ProductCloathing();
				totalItem = productAccesories.calculateDiscount(item);
			}
			totalItems += totalItem;
		}

		if (this.deliveryCountry == "USA"){
			// total=totalItems + tax + 0 shipping
			return totalItems + totalItems * 5 / 100;
		}

		// total=totalItemst + tax + 15 shipping
		return totalItems + totalItems * 5 / 100 + 15;
	}
}
