package tests;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


import io.restassured.response.Response;

public class GetAndPostExamples {
    @Test
    public void testGet() {

        baseURI = "https://reqres.in/api";
        given().
                get("/users?page=2").
                then().
                statusCode(200).
                body("data[4].first_name", equalTo("George")).
                body("data.first_name", hasItems("George", "Rachel")).
                log().all();


    }

    @Test

    public void test_Post() {

        JSONObject request = new JSONObject();
        request.put("name", "Shilpa");
        request.put("job", "QA");
        System.out.println(request.toJSONString());

        baseURI = "https://reqres.in/api";

        given().
                header("Content_Type", "application/json").
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(request.toJSONString()).
                when().
                post("/users").
                then().statusCode(201).
                log().all();


    }


}
