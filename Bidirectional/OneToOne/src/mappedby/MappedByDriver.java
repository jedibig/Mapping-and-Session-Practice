package mappedby;

import dao.DBUtil;
import org.hibernate.Session;
import mappedby.dto.M_Passport;
import mappedby.dto.M_Person;

public class MappedByDriver {
    public static void main(String[] args) {

        M_Person person = M_Person.builder()
                .name("Amy")
                .build();

        M_Passport passport = M_Passport.builder()
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
