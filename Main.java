import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new HotDrink("coffee", 300, 200));
        productList.add(new HotDrink("tea", 200, 500));
        productList.add(new HotDrink("cocoa", 150, 350));
        productList.add(new HotDrink("compote", 100, 250));

        HotDrinkVendingMashine hotDrinkVendingMashine = new HotDrinkVendingMashine();
        hotDrinkVendingMashine.initProduct(productList);

        System.out.println(hotDrinkVendingMashine.getProduct("coffee"));
        System.out.println(hotDrinkVendingMashine.getProduct("tea", 200, 500));
    }

}
