package mappedby.dto;

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
@Table(name = "MO2O_Passport")
public class M_Passport {
    @Id
    @GeneratedValue
    private long passportNumber;
    private String issuingCountry;
    @OneToOne(mappedBy = "passport")
    private M_Person person;
}
