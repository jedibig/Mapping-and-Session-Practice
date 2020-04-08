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
@Table(name = "RO2O_Person")
public class Person {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    @OneToOne
    private Passport passport;
}
