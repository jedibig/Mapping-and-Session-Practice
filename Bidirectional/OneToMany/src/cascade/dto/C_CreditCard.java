package cascade.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Table(name="CO2M_CreditCard")
public class C_CreditCard {
    @Id
    @Column(name="ccNumber")
    private String number;
    private String issuer;
    @ManyToOne
    private C_Person person;
}
