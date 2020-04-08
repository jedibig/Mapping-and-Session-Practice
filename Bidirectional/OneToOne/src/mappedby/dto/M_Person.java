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
@Table(name = "MO2O_Person")
public class M_Person {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    @OneToOne
    private M_Passport passport;
}
