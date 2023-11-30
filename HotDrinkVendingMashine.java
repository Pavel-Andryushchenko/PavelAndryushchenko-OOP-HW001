import java.util.List;

public class HotDrinkVendingMashine implements VendingMashine{
    private List<Product> productList;
    @Override
    public void initProduct(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public Product getProduct(String name) {
        for (Product item: productList
        ) {
            if(item.getName().equals(name)){
                return item;
            }

        }
        return null;
    }


    public Product getProduct(String name, int volume, int temperature) {
        for (Product item: productList
        ) {
            if(item.getName().equals(name)){
                return item;
            }

        }
        return null;
    }
}

