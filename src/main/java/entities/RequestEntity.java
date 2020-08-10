package entities;

import com.google.gson.Gson;

public interface RequestEntity {

    String toJson();

    Gson gson = new Gson();
}
