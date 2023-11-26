import java.util.ArrayList;
import java.util.List;

public interface VendingMashine {
   List<Product> productList = new ArrayList<>();

    public void initProduct(List<Product> productList); //{
//        this.productList = productList;
//    }

    public Product getProduct(String name); //{
//        for (Product item : productList) {
//            if (item.getName().equals(name))
//                return item;
//        }
//        return null;
//    }

}
