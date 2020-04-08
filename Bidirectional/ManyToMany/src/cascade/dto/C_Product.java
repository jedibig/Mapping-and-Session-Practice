package cascade.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Table(name = "CM2M_PRODUCT")
public class C_Product {
    @Id
    private long sku;
    private String name;
    @ManyToMany @Cascade(value = CascadeType.PERSIST)
    private List<C_Store> stores;
}
