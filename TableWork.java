package rest;

public abstract class TableWork {
	int tableId;
	String customerName;
	int waiterId;

	void Drink() {
		System.out.println("welcome Drink of Water");
	}

	abstract void tableType();

	abstract void tableDesign();

}

class AcTable extends TableWork {
	int tableSeating = 6;
	int nuberofTable = 3;

	void Drink() {
		System.out.println("welcome Drink of Water + ice_cream");
	}

	@Override
	void tableType() {
		System.out.println("circle wooden table");
	}

	@Override
	void tableDesign() {
		System.out.println("natural made design table");
	}

}

class NonAcTable extends TableWork {
	int tableSeating = 8;
	int nuberofTable = 5;

	@Override
	void tableType() {
		System.out.println("metal rectangle table");

	}

	@Override
	void tableDesign() {
		System.out.println("homemade design table");
	}

}