package com.java;

import com.java.dao.DBUtil;
import com.java.dto.Brand;
import com.java.dto.Product;
import org.hibernate.Session;

public class Driver {
    public static void main(String[] args) {

        Brand nestle = Brand.builder()
                .brandId(252)
                .brandName("Nestle")
                .build();

        Product milk = Product.builder()
                .sku(2252)
                .name("Milk")
                .brand(nestle)
                .build();

        Product chocolate = Product.builder()
                .sku(774)
                .name("Chocolate")
                .brand(nestle)
                .build();

        try (Session s = DBUtil.getSession()){
            s.beginTransaction();
            s.save(nestle);
            s.save(milk);
            s.save(chocolate);
            s.getTransaction().commit();
        }

    }
}
