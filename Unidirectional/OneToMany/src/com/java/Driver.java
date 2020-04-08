package com.java;

import com.java.dao.DBUtil;
import com.java.dto.CreditCard;
import com.java.dto.Person;
import org.hibernate.Session;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Driver {
    public static void main(String[] args) {
        Person person = Person.builder()
                .name("Amy")
                .build();

        CreditCard cc1 = CreditCard.builder()
                .number("4435473856945499")
                .issuer("Visa")
                .build();

        CreditCard cc2 = CreditCard.builder()
                .number("1034642100934546")
                .issuer("Visa")
                .build();

        CreditCard cc3 = CreditCard.builder()
                .number("6684950457293456")
                .issuer("MasterCard")
                .build();

        Set<CreditCard> creditCards = new HashSet<>(Arrays.asList(cc1,cc2,cc3));

        try(Session s = DBUtil.getSession()){
            s.beginTransaction();
            s.save(person);
            s.save(cc1);
            s.save(cc2);
            s.save(cc3);
            person.setCreditCards(creditCards);
            s.getTransaction().commit();
        }
    }
}
