package mappedby;

import mappedby.dto.M_CreditCard;
import mappedby.dto.M_Person;
import dao.DBUtil;
import org.hibernate.Session;

import java.util.Arrays;
import java.util.List;

public class MappedByDriver {
    public static void main(String[] args) {
        M_Person person = M_Person.builder()
                .name("Amy")
                .build();

        M_CreditCard cc1 = M_CreditCard.builder()
                .number("4435473856945499")
                .issuer("Visa")
                .build();

        M_CreditCard cc2 = M_CreditCard.builder()
                .number("1034642100934546")
                .issuer("Visa")
                .build();

        M_CreditCard cc3 = M_CreditCard.builder()
                .number("6684950457293456")
                .issuer("MasterCard")
                .build();

        List<M_CreditCard> creditCards = Arrays.asList(cc1,cc2,cc3);
        person.setCreditCards(creditCards);

        try(Session s = DBUtil.getSession()){
            s.beginTransaction();
            s.persist(person);
            s.persist(cc1);
            s.persist(cc2);
            s.persist(cc3);
            s.getTransaction().commit();
        }
    }
}
