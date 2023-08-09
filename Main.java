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
        Candle candle1 = new Candle("Luscious Lavender", 3, 5, 7.50);
        Candle candle2 = new Candle("Fragrant Floral's", 5, 7, 18.75);
        Candle candle3 = new Candle("Spicy N' Dicey", 2, 12, 11.98);

        // Calculating totals
        int totalBurnTime = (int) (candle1.burnTime * candle1.quantity +
                candle2.burnTime * candle2.quantity +
                candle3.burnTime * candle3.quantity);
        double totalDollarPerBurnTime = (candle1.price + candle2.price + candle3.price) / totalBurnTime;
        double totalPrice = candle1.getSubtotal() + candle2.getSubtotal() + candle3.getSubtotal();

        // Formatting totalDollarPerBurnTime to 2 decimal places
        DecimalFormat df = new DecimalFormat("#.##");
        String formattedTotalDollarPerBurnTime = df.format(totalDollarPerBurnTime);

        // Generating the receipt
        System.out.println("Receipt\n");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(candle1.name);
        System.out.println("Amount: " + candle1.quantity);
        System.out.println("Burn Time: " + candle1.burnTime + " hours");
        System.out.println("Dollar per Burn Time: $" + df.format(candle1.dollarPerBurnTime));
        System.out.println("Price: $" + candle1.price);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
        System.out.println(candle2.name);
        System.out.println("Amount: " + candle2.quantity);
        System.out.println("Burn Time: " + candle2.burnTime + " hours");
        System.out.println("Dollar per Burn Time: $" + df.format(candle2.dollarPerBurnTime));
        System.out.println("Price: $" + candle2.price);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
        System.out.println(candle3.name);
        System.out.println("Amount: " + candle3.quantity);
        System.out.println("Burn Time: " + candle3.burnTime + " hours");
        System.out.println("Dollar per Burn Time: $" + df.format(candle3.dollarPerBurnTime));
        System.out.println("Price: $" + candle3.price);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
        System.out.println("Total Burn Time: " + totalBurnTime);
        System.out.println("Total Dollar per Burn Time: $" + formattedTotalDollarPerBurnTime);
        System.out.println("Total Price: $" + totalPrice);
    }
}