package regular;

import dao.DBUtil;
import org.hibernate.Session;
import regular.dto.CreditCard;
import regular.dto.Person;

import java.util.Arrays;
import java.util.List;

public class RegularDriver {
    public static void main(String[] args) {
        Person person = Person.builder()
                .name("Amy")
                .build();

        CreditCard cc1 = CreditCard.builder()
                .number("4435473856945499")
                .issuer("Visa")
                .person(person)
                .build();

        CreditCard cc2 = CreditCard.builder()
                .number("1034642100934546")
                .issuer("Visa")
                .person(person)
                .build();

        CreditCard cc3 = CreditCard.builder()
                .number("6684950457293456")
                .issuer("MasterCard")
                .person(person)
                .build();

        List<CreditCard> creditCards = Arrays.asList(cc1,cc2,cc3);

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
