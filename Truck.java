class Truck extends Vehicle {
    double loadCapacity;

    Truck(String brand, String model, double rentalPricePerDay, double loadCapacity) {
        super(brand, model, rentalPricePerDay);
        this.loadCapacity = loadCapacity;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Type: Truck, Load Capacity: " + loadCapacity + " tons");
    }

    @Override
    double calculateRentalCost(int days) {
        return (rentalPricePerDay * days) + (loadCapacity * 100); // Load surcharge
    }
}