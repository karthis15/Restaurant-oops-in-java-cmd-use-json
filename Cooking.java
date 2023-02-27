package rest;

import java.util.ArrayDeque;
import java.util.Queue;

public interface Cooking {
	void foodMake();

	void foodServ();

	void clean();
}

class Cook implements Cooking {
	static Queue<OrderItem> make = new ArrayDeque<>();

	@Override
	public void foodMake() {

		// System.out.println(make);
		while (make.size() != 0) {
			try {
				System.out.println("order is processing");
				Thread.sleep(1000);
				System.out.println("order is ready " + make.peek().getItemName());
				make.poll();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void foodServ() {
		if (make.isEmpty())
			System.out.println("order to serve completed");
		else
			System.out.println("waiting of processing...");
	}

	@Override
	public void clean() {
		System.out.println("cleaning...");

	}
}
