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
@Table(name = "CO2O_Person")
public class C_Person {
    @Id @GeneratedValue
    private long id;
    private String name;
    @OneToOne( cascade = CascadeType.PERSIST)
    private C_Passport passport;

    // If you persist person object, passport will be cascaded passport

    // merge -> update
    // remove -> delete
    // refresh

    // since we use casscade,
}
