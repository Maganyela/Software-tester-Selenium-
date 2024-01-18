package RestCalls;

import static org.testng.Assert.assertEquals;

public class RestAssert {

    public static void assertApi(int expectedStatusCode, int actualStatusCode) {

        if (expectedStatusCode >= 200 && actualStatusCode <= 299) {
            System.out.println("test passed ");

            assertEquals(actualStatusCode, expectedStatusCode);

        } else {
            System.out.println("test failed ");

            assertEquals(actualStatusCode, expectedStatusCode);
        }
    }
}
