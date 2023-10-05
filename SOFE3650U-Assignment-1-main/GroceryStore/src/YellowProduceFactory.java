import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class YellowProduceFactory extends GroceryProductFactory{
    @Override
    public Fruit createFruit() {
        Banana banana = new Banana();
        banana.setPrice(readPriceFromFile(2));
        return banana;
    }

    @Override
    public Vegetable createVegetable() {
        Corn corn = new Corn();
        corn.setPrice(readPriceFromFile(3));
        return corn;
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
