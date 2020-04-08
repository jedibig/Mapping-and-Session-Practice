package regular.dto;

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
@Table(name="RO2M_CreditCard")
public class CreditCard {
    @Id
    @Column(name="ccNumber")
    private String number;
    private String issuer;
    @ManyToOne
    private Person person;
}
