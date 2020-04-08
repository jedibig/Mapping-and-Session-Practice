package mappedby;

import dao.DBUtil;
import mappedby.dto.M_Product;
import mappedby.dto.M_Store;
import org.hibernate.Session;

import java.util.Arrays;
import java.util.List;

public class MappedByDriver {
    public static void main(String[] args) {

        M_Store chicago = M_Store.builder()
                .storeId(252)
                .city("Chicago")
                .build();

        M_Store miami = M_Store.builder()
                .storeId(657)
                .city("Miami")
                .build();

        List<M_Store> MStoreList = Arrays.asList(chicago,miami);

        M_Product milk = M_Product.builder()
                .sku(2252)
                .name("Milk")
                .stores(MStoreList)
                .build();

        M_Product chocolate = M_Product.builder()
                .sku(774)
                .name("Chocolate")
                .stores(MStoreList)
                .build();

        List<M_Product> productList1 = Arrays.asList(milk,chocolate);
        List<M_Product> productList2 = Arrays.asList(milk);

        chicago.setProductList(productList1);
        miami.setProductList(productList2);

        try (Session s = DBUtil.getSession()){
            s.beginTransaction();
            s.save(chicago);
            s.save(miami);
            s.save(milk);
            s.save(chocolate);
            s.getTransaction().commit();
        }

    }
}
