package mappedby.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Table(name = "MO2M_Person")
public class M_Person {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    @OneToMany(mappedBy = "person")
    private List<M_CreditCard> creditCards;
}
