package utils;

import com.google.gson.Gson;
import entities.Employee;
import entities.RequestEntity;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ResponseUtils {

    private static final Gson gson = new Gson();


    public static String getResponseBodyAsStr(Response response) {
        return response.getBody().asString();
    }

    public static <T extends RequestEntity> T extractObjFromResponse(Response response, Class<T> tClass) {
        return gson.fromJson(getResponseBodyAsStr(response), tClass);
    }

    public static void main(String[] args) {
        Response response = given().get();

        Employee employee = extractObjFromResponse(response, Employee.class);

        assertThat("Error message", employee.getAge(), equalTo(10));
    }

}
