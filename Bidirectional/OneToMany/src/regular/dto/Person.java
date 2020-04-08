package regular.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Table(name="RO2M_Person")
public class Person {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    @OneToMany
    private List<CreditCard> creditCards;
}
