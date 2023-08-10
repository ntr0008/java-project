import java.text.DecimalFormat;
import java.util.Scanner;



class Candle {
    String name;
    int quantity;
    double burnTime;
    double dollarPerBurnTime;
    double price;

    Candle(String name, int quantity, double burnTime, double price) {
        this.name = name;
        this.quantity = quantity;
        this.burnTime = burnTime;
        this.price = price;
        this.dollarPerBurnTime = price / burnTime;
    }

    double getSubtotal() {
        return price * quantity;
    }
    // Adding a method to display candle details
    void displayCandleDetails() {
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(name);
        System.out.println("Amount: " + quantity);
        System.out.println("Burn Time: " + burnTime + " hours");
        System.out.println("Dollar per Burn Time: $" + df.format(dollarPerBurnTime));
        System.out.println("Price: $" + price);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating 3 different types of candles
        Candle lavender = new Candle("Lavender", 3, 5, 7.50);
        Candle floral = new Candle("Fragrant Floral's", 5, 7, 18.75);
        Candle cinna = new Candle("Spicy Cinnamon", 2, 12, 11.98);

        // Displaying candle details
        lavender.displayCandleDetails();
        floral.displayCandleDetails();
        cinna.displayCandleDetails();

        // Calculating totals
        int totalBurnTime = (int) (lavender.burnTime * lavender.quantity +
                floral.burnTime * floral.quantity +
                cinna.burnTime * cinna.quantity);
        double totalDollarPerBurnTime = (lavender.price + floral.price + cinna.price) / totalBurnTime;
        double totalPrice = lavender.getSubtotal() + floral.getSubtotal() + cinna.getSubtotal();

        // Formatting totalDollarPerBurnTime to 2 decimal places
        DecimalFormat df = new DecimalFormat("#.##");
        String formattedTotalDollarPerBurnTime = df.format(totalDollarPerBurnTime);

        // Displaying total values
        System.out.println("Total Burn Time: " + totalBurnTime);
        System.out.println("Total Dollar per Burn Time: $" + formattedTotalDollarPerBurnTime);
        System.out.println("Total Price: $" + totalPrice);

        // Closing the scanner
        scanner.close();
    }
}