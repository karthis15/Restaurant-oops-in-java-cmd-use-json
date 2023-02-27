package rest;

public class MenuItems {
	public int itemId;
	public String itemName;
	public int itemprice;

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemprice() {
		return itemprice;
	}

	public void setItemprice(int itemprice) {
		this.itemprice = itemprice;
	}

	@Override
	public String toString() {
		return "Menu [itemId=" + itemId + ", itemName=" + itemName + ", itemprice=" + itemprice + "]";
	}

	public MenuItems(int itemId, String itemName, int itemprice) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemprice = itemprice;
	}
}
