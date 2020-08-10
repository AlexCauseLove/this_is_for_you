package entities;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class ProductList implements RequestEntity {

    private Integer count;
    private Integer next;
    private Integer previous;
    private String facets;
    private List<Result> results;

    public String toJson() {
        return gson.toJson(this);
    }
}
