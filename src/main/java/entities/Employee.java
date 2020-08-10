package entities;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Employee implements RequestEntity {

    private int age;
    private int stage;
    private String firstName;
    private String secondName;
    private int salary;

    public String toJson() {
        return gson.toJson(this);
    }

}
