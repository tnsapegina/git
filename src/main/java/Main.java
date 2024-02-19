import org.example.BottleOfWater;
import org.example.Product;
import org.example.VendingMachine;

import java.util.List;

public class Main {

    public class Main {
        public static void main(String[] args) {

            System.out.println();
            VendingMachineHotDrinks vmHotDrinks = new VendingMachineHotDrinks();
            List<HotDrinks> hotDrinksList = new ArrayList<>(Arrays.asList(
                    new HotDrinks("Coffee", new BigDecimal(3), 0.3, 90),
                    new HotDrinks("Tea", new BigDecimal(1), 0.4, 80),
                    new HotDrinks("Milk", new BigDecimal(3), 1.0, 50)));
            vmHotDrinks.initProduct(hotDrinksList);
            System.out.println("Поиск по названию: " + vmHotDrinks.getProduct("Coffee"));
            System.out.println("Поиск по цене <=: " + vmHotDrinks.getProduct(new BigDecimal(2.5)));
            System.out.println("Поиск по температуре <=: " + vmHotDrinks.getProduct(70));
        }
    }
