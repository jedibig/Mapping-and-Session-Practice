package cascade;

import cascade.dto.C_CreditCard;
import cascade.dto.C_Person;
import dao.DBUtil;
import org.hibernate.Session;

import java.util.Arrays;
import java.util.List;


public class CascadeDriver {
    public static void main(String[] args) {
        C_Person person = C_Person.builder()
                .name("Amy")
                .build();

        C_CreditCard cc1 = C_CreditCard.builder()
                .number("4435473856945499")
                .issuer("Visa")
                .build();

        C_CreditCard cc2 = C_CreditCard.builder()
                .number("1034642100934546")
                .issuer("Visa")
                .build();

        C_CreditCard cc3 = C_CreditCard.builder()
                .number("6684950457293456")
                .issuer("MasterCard")
                .build();

        List<C_CreditCard> creditCards = Arrays.asList(cc1,cc2,cc3);
        person.setCreditCards(creditCards);

        try(Session s = DBUtil.getSession()){
            s.beginTransaction();
            s.persist(person);
            s.getTransaction().commit();
        }
    }
}
