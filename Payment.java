package rest;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Payment {
	static long totalPrice = 0;
	Scanner sc = new Scanner(System.in);

	void billPass() {
		Queue<OrderItem> makeBill = new ArrayDeque<>();
		makeBill.addAll(Waiter.order);
		for (OrderItem orderItem : makeBill) {
			long total = orderItem.getItemPrice() * orderItem.getNumberOfItem();
			totalPrice += total;
			System.out.println(orderItem.getItemName() + " :" + orderItem.getNumberOfItem() + " :" + total);
		}
		System.out.println("Ac " + Waiter.acTablePrice);
		totalPrice += Waiter.acTablePrice;
		System.out.println("Total Amount is Rs:" + totalPrice);
	}

	void acceptPayment() {
		if (totalPrice == 0 && Waiter.order.size() != 0) {
			System.out.println("bill not generate");
		}
		while (totalPrice > 0) {
			System.out.println("Total Amount is Rs:" + totalPrice);
			System.out.println("Enter your amount");
			long amount = sc.nextInt();
			if (amount < totalPrice) {
				totalPrice -= amount;
				System.out.println("Pay your balance amount Rs:" + totalPrice);
			} else {
				System.out.println("Your balance amount is Rs:" + (amount - totalPrice));
				totalPrice -= amount;
			}
			if (totalPrice == 0) {
				Waiter.order.clear();
			}

		}

	}
}
