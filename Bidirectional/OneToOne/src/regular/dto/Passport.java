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
@Table(name = "RO2O_Passport")
public class Passport {
    @Id
    @GeneratedValue
    private long passportNumber;
    private String issuingCountry;
    @OneToOne
    private Person person;
}
