package rest;

import java.io.IOException;
import java.util.Scanner;

import org.json.simple.parser.ParseException;

public class Restaurant {
	public static void main(String[] args) throws IOException, ParseException, java.text.ParseException {
		Customer customer = new Customer();
		Waiter waiter = new Waiter();
		// Manager manager = new Manager();
		Cook cook = new Cook();
		Payment payment = new Payment();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		MenuItemAdd.demo();
		System.out.println("Welcome to Black_Pink Restaurant...");
		String con;
		do {
			System.out.println(
					"1.)Table Booking\n2.)Menu Item\n3.)Order Item\n4.)View OrderItem\n5.)Remove Order\n6.)Searching OrderId\n7.)Received Order\n8.)Bill Create\n9.)Bill Pay");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				waiter.tableAllocation();
				break;
			case 2:
				customer.callWaiter();
				break;
			case 3:
				waiter.serves();
				break;
			case 4:
				waiter.orderList();
				break;
			case 5:
				int i = customer.removeItem();
				if (i == 1) {
					waiter.removeItemId();
				} else {
					waiter.removeNumberOfItem();
				}
				break;
			case 6:
				waiter.SearchingOrderId();
				break;
			case 7:
				cook.foodMake();
				cook.foodServ();
				break;
			case 8:
				payment.billPass();
				break;
			case 9:
				customer.payment();
				break;
			default:
				if (Waiter.order.size() != 0)
					System.out.println("process bending");
				else
					System.out.println("Enter the curret choies..");
			}
			System.out.println("Back to the Manu..?y or n");
			con = sc.next();
		} while (con.equals("yes") || con.equals("y"));
		System.out.println("Think you for Coming...");
	}
}
