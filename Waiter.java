package rest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Waiter extends MenuItemAdd {
	public static int acTablePrice = 0;
	public static int orderid = 0;
	public static int id = 0;
	static ArrayList<OrderItem> order = new ArrayList<>();
	int waiterId;
	String waiterName;
	Customer customer = new Customer();
	Scanner sc = new Scanner(System.in);

	void tableAllocation() {
		System.out.println("do you want have ac or non_ac");
		String type = sc.next();
		if (type.equals("ac") || type.equals("AC")) {
			TableWork table = new AcTable();
			table.Drink();
			table.tableType();
			table.tableDesign();
			acTablePrice = 500;
		} else {
			TableWork table = new NonAcTable();
			table.Drink();
			table.tableType();
			table.tableDesign();
		}
	}

	void SearchingOrderId() {
		System.out.println("Enter your OrderId");
		int orderId = sc.nextInt();
		int count = 0;
		for (OrderItem orderItem : order) {
			if (orderItem.getOrderId() == orderId) {
				System.out.println("your :" + orderItem);
				count++;
			}
		}
		if (count == 0)
			System.out.println("your order id is invalid...");
	}

	void serves() {
		String con;
		do {
			int item[] = Customer.orderItem();
			MenuItemAdd.menuItems.iterator();
			int orderId = item[0], numberOfOrder = item[1];
			orderId -= 1;
			if (MenuItemAdd.menuItems.get(orderId) != null) {
				orderid += 1;
				String st = MenuItemAdd.menuItems.get(orderId).getItemName();
				int price = MenuItemAdd.menuItems.get(orderId).getItemprice();
				order.add(new OrderItem(orderid, st, price, numberOfOrder));
			} else {
				System.out.println("Sorry Item Is Not Available...");
			}
			System.out.println("do you continue your Order?y or n");
			con = sc.next();
		} while (con.equals("yes") || con.equals("y"));
	}

	void orderList() {
		Iterator<OrderItem> it = order.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	void removeItemId() {
		System.out.println("Enter the order id");
		int item = sc.nextInt();
		item -= 1;
		System.out.println(order.remove(item));
	}

	void removeNumberOfItem() {
		System.out.println("Enter the order id & number of item");
		int item = sc.nextInt();
		int nuberOfItem = sc.nextInt();
		item -= 1;
		if (nuberOfItem <= order.get(item).getNumberOfItem()) {
			int get = order.get(item).getNumberOfItem();
			get -= nuberOfItem;
			order.get(item).setNumberOfItem(get);
			System.out.println("removed...");
		} else {
			System.out.println("your number order is" + order.get(item).getNumberOfItem());
		}
		// System.out.println(order.remove(item));
	}

	void Orderproces() {
		if (id == 0 && order.size() != 0) {
			Cook.make.addAll(order);
			id += 1;
		}
	}
}
