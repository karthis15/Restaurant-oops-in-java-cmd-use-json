package rest;
public class OrderItem {
	  private int orderId;
      private String itemName;
      private int itemPrice;
      private int numberOfItem;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}
	public int getNumberOfItem() {
		return numberOfItem;
	}
	public void setNumberOfItem(int numberOfItem) {
		this.numberOfItem = numberOfItem;
	}
	@Override
	public String toString() {
		return "OrderItem [orderId=" + orderId + ", itemName=" + itemName + ", itemPrice=" + itemPrice
				+ ", numberOfItem=" + numberOfItem + "]";
	}
	public OrderItem(int orderId, String itemName, int itemPrice, int numberOfItem) {
		super();
		this.orderId = orderId;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.numberOfItem = numberOfItem;
	}

}
