package RestCalls;

import io.restassured.response.Response;

public class RestService {

    public static void createuser(int id, String userName){

        String endPoint = "https://petstore.swagger.io/v2/user";

        String body = RestBody.createuser(id,userName);

        Response rsp = RestCalls.sendPost(body, endPoint);

        String responseBody = rsp.asPrettyString();

        int statusCode = rsp.statusCode();

        System.out.println("responseBody: " + responseBody );
        System.out.println("statusCode: " + statusCode);

        RestAssert.assertApi(200,statusCode);
    }

    public static void updateuser(String userName){

        String endPoint = "https://petstore.swagger.io/v2/user/" + userName;

        String body = RestBody.updateuser(userName);

        Response rsp = RestCalls.sendPut(body, endPoint);

        String responseBody = rsp.asPrettyString();

        int statusCode = rsp.statusCode();

        System.out.println("responseBody: " + responseBody );
        System.out.println("statusCode: " + statusCode);

        RestAssert.assertApi(200,statusCode);
    }

    public static void getuser(String userName){

        String endPoint = "https://petstore.swagger.io/v2/user/" + userName;


        Response rsp = RestCalls.sendGet(endPoint);

        String responseBody = rsp.asPrettyString();

        int statusCode = rsp.statusCode();

        System.out.println("responseBody: " + responseBody );
        System.out.println("statusCode: " + statusCode);

        RestAssert.assertApi(200,statusCode);
    }
    public static void deleteuser(String userName){

        String endPoint = "https://petstore.swagger.io/v2/user/" + userName;

        Response rsp = RestCalls.sendDelete( endPoint);

        String responseBody = rsp.asPrettyString();

        int statusCode = rsp.statusCode();

        System.out.println("responseBody: " + responseBody );
        System.out.println("statusCode: " + statusCode);

        RestAssert.assertApi(200,statusCode);
    }

//    public static void getuserNegative(String userName){
//
//        String endPoint = "https://petstore.swagger.io/v2/user/" + userName;
//
//
//        Response rsp = RestCalls.sendGet(endPoint);
//
//        String responseBody = rsp.asPrettyString();
//
//        int statusCode = rsp.statusCode();
//
//        System.out.println("responseBody: " + responseBody );
//        System.out.println("statusCode: " + statusCode);
//
//        RestAssert.assertApi(404,statusCode);
//    }
}
