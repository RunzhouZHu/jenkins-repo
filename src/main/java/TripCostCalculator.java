import java.util.Scanner;

public class TripCostCalculator {

    public static double calculateTripCost(double kilometers, double fuelPrice, double fuelConsumptionPer100km) {
        double fuelNeeded = (kilometers / 100) * fuelConsumptionPer100km;
        return fuelNeeded * fuelPrice;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the distance in kilometers: ");
        double kilometers = sc.nextDouble();

        System.out.println("Enter the fuel price in liters: ");
        double fuelPrice = sc.nextDouble();

        double tripCost =  calculateTripCost(kilometers, fuelPrice, 5);
        System.out.println("The trip cost is: " + tripCost);

    }
}
