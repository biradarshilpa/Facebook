package tests;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class PutPatchDeleteExamples {
    @Test

    public void test_Put() {

        JSONObject request = new JSONObject();
        request.put("name", "Shilpa");
        request.put("job", "Developer");
        System.out.println(request.toJSONString());

        baseURI = "https://reqres.in/api";

        given().
                header("Content_Type", "application/json").
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(request.toJSONString()).
                when().
                put("/users/2").
                then().statusCode(200).
                log().all();


    }
@Test
    public void test_Patch() {

        JSONObject request = new JSONObject();
        request.put("name", "Shilpa");
        request.put("job", "Developer");
        System.out.println(request.toJSONString());

        baseURI = "https://reqres.in";

        given().
                header("Content_Type", "application/json").
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(request.toJSONString()).
                when().
                patch("/api/users/2").
                then().statusCode(200).
                log().all();


    }

    @Test
    public void test_Delete() {

        baseURI = "https://reqres.in";

                given().when().
                delete("/api/users/2").
                then().statusCode(204).
                log().all();


    }


}
