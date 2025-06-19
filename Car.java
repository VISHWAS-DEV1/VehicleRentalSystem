class Car extends Vehicle {
	int numberOfSeats;

	Car(String brand, String model, double rentalPricePerDay, int numberOfSeats) {
		super(brand, model, rentalPricePerDay);
		this.numberOfSeats = numberOfSeats;
	}

	@Override
	void displayDetails() {
		super.displayDetails();
		System.out.println("Type: Car, Seats: " + numberOfSeats);
	}

	@Override
	double calculateRentalCost(int days) {
		return (rentalPricePerDay * days) + 500; // Additional tax
	}
}
