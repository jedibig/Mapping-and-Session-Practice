package cascade;

import dao.DBUtil;
import cascade.dto.C_Product;
import cascade.dto.C_Store;
import org.hibernate.Session;

import java.util.Arrays;
import java.util.List;

public class CascadeDriver {
    public static void main(String[] args) {

        C_Store chicago = C_Store.builder()
                .storeId(252)
                .city("Chicago")
                .build();

        C_Store miami = C_Store.builder()
                .storeId(657)
                .city("Miami")
                .build();

        List<C_Store> storeList = Arrays.asList(chicago,miami);

        C_Product milk = C_Product.builder()
                .sku(2252)
                .name("Milk")
                .stores(storeList)
                .build();

        C_Product chocolate = C_Product.builder()
                .sku(774)
                .name("Chocolate")
                .stores(storeList)
                .build();

        List<C_Product> productList1 = Arrays.asList(milk,chocolate);
        List<C_Product> productList2 = Arrays.asList(milk);

        chicago.setProductList(productList1);
        miami.setProductList(productList2);

        try (Session s = DBUtil.getSession()){
            s.beginTransaction();
            s.persist(chicago);
            s.persist(miami);
            s.getTransaction().commit();
        }

    }
}
