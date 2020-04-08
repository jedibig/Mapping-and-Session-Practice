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
@Table(name = "CO2O_Passport")
public class C_Passport {
    @Id
    private long passportNumber;
    private String issuingCountry;
    @OneToOne(mappedBy = "passport")
    private C_Person person;
}
