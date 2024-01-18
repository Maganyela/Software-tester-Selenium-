package RestCalls;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class RestCalls {

    public static Response sendPost(String body, String endPoint){

        Response rsp;

        rsp = given()
                .contentType("application/json")
                .body(body)
                .post(endPoint);

        return rsp;
    }

    public static Response sendPut(String body, String endPoint){

        Response rsp;

        rsp = given()
                .contentType("application/json")
                .body(body)
                .put(endPoint);

        return rsp;
    }

    public static Response sendGet( String endPoint){

        Response rsp;

        rsp = given()
                .contentType("application/json")
                .get(endPoint);
        return rsp;
    }

    public static Response sendDelete( String endPoint){

        Response rsp;

        rsp = given()
                .contentType("application/json")
                .delete(endPoint);
        return rsp;
    }

}
