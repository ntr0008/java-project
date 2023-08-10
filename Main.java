import java.text.DecimalFormat;

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
}

public class Main {
    public static void main(String[] args) {
        // Creating 3 different types of candles
        Candle lavender = new Candle("Lavender", 3, 5, 7.50);
        Candle floral = new Candle("Fragrant Floral's", 5, 7, 18.75);
        Candle cinna = new Candle("Spicy Cinnaimon", 2, 12, 11.98);

        // Calculating totals
        int totalBurnTime = (int) (lavender.burnTime * lavender.quantity +
                floral.burnTime * floral.quantity +
                cinna.burnTime * cinna.quantity);
        double totalDollarPerBurnTime = (lavender.price + floral.price + cinna.price) / totalBurnTime;
        double totalPrice = lavender.getSubtotal() + floral.getSubtotal() + cinna.getSubtotal();

        // Formatting totalDollarPerBurnTime to 2 decimal places
        DecimalFormat df = new DecimalFormat("#.##");
        String formattedTotalDollarPerBurnTime = df.format(totalDollarPerBurnTime);

        // Generating the receipt
        System.out.println("Receipt\n");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(lavender.name);
        System.out.println("Amount: " + lavender.quantity);
        System.out.println("Burn Time: " + lavender.burnTime + " hours");
        System.out.println("Dollar per Burn Time: $" + df.format(lavender.dollarPerBurnTime));
        System.out.println("Price: $" + lavender.price);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
        System.out.println(floral.name);
        System.out.println("Amount: " + floral.quantity);
        System.out.println("Burn Time: " + floral.burnTime + " hours");
        System.out.println("Dollar per Burn Time: $" + df.format(floral.dollarPerBurnTime));
        System.out.println("Price: $" + floral.price);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
        System.out.println(cinna.name);
        System.out.println("Amount: " + cinna.quantity);
        System.out.println("Burn Time: " + cinna.burnTime + " hours");
        System.out.println("Dollar per Burn Time: $" + df.format(cinna.dollarPerBurnTime));
        System.out.println("Price: $" + cinna.price);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
        System.out.println("Total Burn Time: " + totalBurnTime);
        System.out.println("Total Dollar per Burn Time: $" + formattedTotalDollarPerBurnTime);
        System.out.println("Total Price: $" + totalPrice);
    }
}