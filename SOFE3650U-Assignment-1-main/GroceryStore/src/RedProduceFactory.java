import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class RedProduceFactory extends GroceryProductFactory{
    @Override
    public Fruit createFruit() {
        Apple apple = new Apple();
        apple.setPrice(readPriceFromFile(0));
        return apple;
    }

    @Override
    public Vegetable createVegetable() {
        RedPepper redPepper = new RedPepper();
        redPepper.setPrice(readPriceFromFile(1));
        return redPepper;
    }

    // Method to read the price from file based on line number parameter.
    private double readPriceFromFile(int lineNumber){
        try {
            String line = Files.readAllLines(Paths.get("product-prices.txt")).get(lineNumber);
            double price = Double.parseDouble(line.substring(0,4));
            return price;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
