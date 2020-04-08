package regular;

import dao.DBUtil;
import regular.dto.Product;
import regular.dto.Store;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RegularDriver {
    public static void main(String[] args) {

        Store chicago = Store.builder()
                .storeId(252)
                .city("Chicago")
                .productList(new ArrayList<>())
                .build();

        Store miami = Store.builder()
                .storeId(657)
                .city("Miami")
                .productList(new ArrayList<>())
                .build();

        List<Store> storeList = Arrays.asList(chicago,miami);

        Product milk = Product.builder()
                .sku(2252)
                .name("Milk")
                .stores(storeList)
                .build();

        Product chocolate = Product.builder()
                .sku(774)
                .name("Chocolate")
                .stores(storeList)
                .build();

        List<Product> productList1 = Arrays.asList(milk,chocolate);
        List<Product> productList2 = Arrays.asList(milk);

        try (Session s = DBUtil.getSession()){
            s.beginTransaction();
            s.save(chicago);
            s.save(miami);
            s.save(milk);
            s.save(chocolate);
            chicago.setProductList(productList1);
            miami.setProductList(productList2);
            s.getTransaction().commit();
        }

    }
}
