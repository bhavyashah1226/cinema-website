// Test generated by RoostGPT for test restAssuredTest using AI Type Azure Open AI and AI Model roost-gpt4-32k

// RoostTestHash=4940f5c55b

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.instanceOf;
import org.hamcrest.MatcherAssert;

public class RoostTest {

    @Test
    public void nobelPrizes_get_Test() {
        RestAssured.baseURI = System.getenv("BASE_URL");

        // Read CSV file 
        String filePath = "src/test/java/com/team/RoostTest/nobelPrizes_get.csv";
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(filePath))) {

            String headerLine = reader.readLine();  
            String[] headers = headerLine.split(",");

            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");

                // Create a map of header to data
                Map<String, String> map = new HashMap<>();
                for (int i = 0; i < headers.length; i++) {
                    map.put(headers[i], data[i]);
                }

                Response response = given()
                .pathParam("offset", map.get("offset"))
                .pathParam("limit", map.get("limit"))
                .pathParam("sort", map.get("sort"))
                .pathParam("nobelPrizeYear", map.get("nobelPrizeYear"))
                .pathParam("yearTo", map.get("yearTo"))
                .pathParam("nobelPrizeCategory", map.get("nobelPrizeCategory"))
                .pathParam("format", map.get("format"))
                .pathParam("csvLang", map.get("csvLang"))
                .when()
                .get("/nobelPrizes")
                .then()
                .extract().response();

                // Use condition instead of comparing every time
                int statusCode = response.statusCode();
                if (statusCode == 200) {
                    assertSuccessResponse(response);
                } else if (statusCode == 400 || statusCode == 404 || statusCode == 422) {
                    assertErrorResponse(response);
                } else {
                    fail("Unexpected status code: " + statusCode);
                } 
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void assertSuccessResponse(Response response) {
        MatcherAssert.assertThat("Verifying response object", response.jsonPath().get("nobelPrizes"), instanceOf(List.class));
    }

    private void assertErrorResponse(Response response) {
        MatcherAssert.assertThat("Verifying 'code'", response.jsonPath().get("code"), instanceOf(String.class));
        MatcherAssert.assertThat("Verifying 'message'", response.jsonPath().get("message"), instanceOf(String.class));
    }
}
