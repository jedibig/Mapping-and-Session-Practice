package com.java;

import com.java.dao.DBUtil;
import com.java.dto.Passport;
import com.java.dto.Person;
import org.hibernate.Session;

public class Driver {
    public static void main(String[] args) {
        Passport passport = Passport.builder()
                .passportNumber(54623)
                .issuingCountry("USA")
                .build();
        Person person = Person.builder()
                .name("Amy")
                .build();

        try (Session s = DBUtil.getSession()){
            s.beginTransaction();
            s.save(person);
            s.save(passport);
            person.setPassport(passport);
            s.getTransaction().commit();
        }
    }
}
