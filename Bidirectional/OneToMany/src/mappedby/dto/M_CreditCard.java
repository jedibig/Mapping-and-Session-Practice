package mappedby.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import regular.dto.Person;

import javax.persistence.*;


@Entity
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Table(name="MO2M_CreditCard")
public class M_CreditCard {
    @Id
    @Column(name="ccNumber")
    private String number;
    private String issuer;
    @ManyToOne
    private M_Person person;
}
