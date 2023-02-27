package rest;

import java.util.Scanner;

public class Customer {
	String customerName;
	int phoneNumber;
	int tableId;
	// Waiter waiter=new Waiter(); //java.lang.StackOverflowError
	static Scanner sc = new Scanner(System.in);

	void callWaiter() {
		System.out.println("The Menu Item List ");
		MenuItemAdd menuItem = new MenuItemAdd();
		menuItem.menus();
	}

	static int[] orderItem() {
		System.out.println("Enter the Order_Id & Number Of Order");
		int orderId = sc.nextInt();
		int numberOfOrder = sc.nextInt();
		return new int[] { orderId, numberOfOrder };
	}

	int removeItem() {
		System.out.println("Do you remove Item or number of item");
		String st = sc.next();
		if (st.equals("y") || st.equals("yes")) {
			return 1;
		} else {
			return 0;
		}
	}

	void payment() {
		new Payment().acceptPayment();
	}
}
