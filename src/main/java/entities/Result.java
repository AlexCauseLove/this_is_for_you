package entities;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class Result implements RequestEntity {

    @SerializedName("product_id")
    private String productId;
    private String description;
    @SerializedName("measure_unit")
    private String measureUnit;
    private String volume;
    @SerializedName("mprice")
    private Integer mPrice;
    private Boolean restricted;
    private List<Category> category;

    public String toJson() {
        return gson.toJson(this);
    }
}
