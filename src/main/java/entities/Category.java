package entities;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Category implements RequestEntity {

    @SerializedName("category_id")
    private String categoryId;
    private String description;
    private int level;

    public String toJson() {
        return gson.toJson(this);
    }
}
