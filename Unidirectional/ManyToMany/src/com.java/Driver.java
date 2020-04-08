package com.java;

import com.java.dao.DBUtil;
import com.java.dto.Product;
import com.java.dto.Store;
import org.hibernate.Session;

import java.util.Arrays;
import java.util.List;

public class Driver {
    public static void main(String[] args) {

        Store chicago = Store.builder()
                .storeId(252)
                .city("Chicago")
                .build();

        Store miami = Store.builder()
                .storeId(774)
                .city("Miami")
                .build();

        List<Store> storeList = Arrays.asList(chicago,miami);

        Product milk = Product.builder()
                .sku(2252)
                .name("Milk")
                .stores(storeList)
                .build();

        try (Session s = DBUtil.getSession()){
            s.beginTransaction();
            s.save(chicago);
            s.save(miami);
            s.save(milk);
            s.getTransaction().commit();
        }

    }
}
