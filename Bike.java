class Bike extends Vehicle {
    boolean hasGear;

    Bike(String brand, String model, double rentalPricePerDay, boolean hasGear) {
        super(brand, model, rentalPricePerDay);
        this.hasGear = hasGear;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Type: Bike, Has Gear: " + hasGear);
    }
}