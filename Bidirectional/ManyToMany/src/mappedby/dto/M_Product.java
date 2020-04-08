package mappedby.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
@Table(name = "MM2M_PRODUCT")
public class M_Product {
    @Id
    private long sku;
    private String name;
    @ManyToMany(mappedBy = "productList")
    private List<M_Store> stores;
}
