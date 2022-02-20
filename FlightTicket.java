package flightTicket;

import java.util.Scanner;

public class FlightTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int km, age, travelType;
        double pricePerKm = 0.10, customPrice;

        System.out.print("Enter the distance in km: ");
        km = scanner.nextInt();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        System.out.print("Enter travel type (1 => One Way , 2 => Round Trip ): ");
        travelType = scanner.nextInt();

        customPrice = km * pricePerKm;

        if (age < 12) {
            customPrice -= ((customPrice * 50) / 100);
        } else if ((age >= 12) && (age <= 24)) {
            customPrice -= ((customPrice * 10) / 100);
        } else if (age > 65) {
            customPrice -= ((customPrice * 30) / 100);
        }
        System.out.println(" ");
        switch (travelType) {
            case 1:
                System.out.println("Total Amaount " + customPrice + " TL");
                break;
            case 2:
                customPrice -= ((customPrice * 20) / 100);
                customPrice *= 2;
                System.out.println("Total Amaount " + customPrice + " TL");
                break;
            default:
                System.out.println("Invalid Choice!!!");
        }
        scanner.close();

    }
}
