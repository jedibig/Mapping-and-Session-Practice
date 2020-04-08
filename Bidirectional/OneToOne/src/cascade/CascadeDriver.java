package cascade;

import dao.DBUtil;
import cascade.dto.C_Passport;
import cascade.dto.C_Person;
import org.hibernate.Session;

public class CascadeDriver {
    public static void main(String[] args) {

        C_Person person = C_Person.builder()
                .name("Amy")
                .build();

        C_Passport passport = C_Passport.builder()
                .passportNumber(54623)
                .issuingCountry("USA")
                .person(person)
                .build();

        person.setPassport(passport);

        try (Session s = DBUtil.getSession()){
            s.beginTransaction();
            s.persist(person);
            s.getTransaction().commit();
        }
    }
}
