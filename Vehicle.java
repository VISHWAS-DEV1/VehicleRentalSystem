class Vehicle {
    String brand;
    String model;
    double rentalPricePerDay;

    Vehicle(String brand, String model, double rentalPricePerDay) {
        this.brand = brand;
        this.model = model;
        this.rentalPricePerDay = rentalPricePerDay;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Rental Price/Day: ₹" + rentalPricePerDay);
    }

    double calculateRentalCost(int days) {
        return rentalPricePerDay * days;
    }
}