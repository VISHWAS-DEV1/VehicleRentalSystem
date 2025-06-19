public class VehicleRentalSystem {
    public static void main(String[] args) {
        // Create an array of Vehicle references
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car("Toyota", "Fortuner", 1500, 5);
        vehicles[1] = new Bike("Yamaha", "R15", 500, true);
        vehicles[2] = new Truck("Tata", "LPT", 2500, 10);

        // Display details and calculate cost
        for (Vehicle v : vehicles) {
            v.displayDetails();
            System.out.println("Rental Cost for 5 days: ₹" + v.calculateRentalCost(5));
            System.out.println("--------------------------------------------------");
        }
    }
}