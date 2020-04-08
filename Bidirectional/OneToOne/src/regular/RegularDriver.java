package regular;

import dao.DBUtil;
import org.hibernate.Session;
import regular.dto.Passport;
import regular.dto.Person;

public class RegularDriver {
    public static void main(String[] args) {

        Person person = Person.builder()
                .name("Amy")
                .build();

        Passport passport = Passport.builder()
                .passportNumber(54623)
                .issuingCountry("USA")
                .person(person)
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
