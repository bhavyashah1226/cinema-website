// Test generated by RoostGPT for test restAssuredTest using AI Type Azure Open AI and AI Model roost-gpt4-32k

// RoostTestHash=4940f5c55b

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.hamcrest.MatcherAssert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class nobelPrizesGetTest {

    @Test
    public void nobelPrizes_get_Test() {
        RestAssured.baseURI = System.getenv("BASE_URL");

        try (BufferedReader reader = new BufferedReader(new FileReader("src/test/java/com/team/RoostTest/nobelPrizes_get.csv"))) {
            String headerLine = reader.readLine();
            String[] headers = headerLine.split(",");

            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");

                Map<String, String> map = new HashMap<>();
                for (int i = 0; i < headers.length; i++) {
                    map.put(headers[i], data[i]);
                }

                Response response = given()
                        .queryParams(map)
                        .when()
                        .get("/nobelPrizes")
                        .then()
                        .assertThat()
                        .statusCode(either(is(200)).or(is(400)).or(is(404)).or(is(422)))
                        .extract().response();
                        
                validateResponse(response);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void validateResponse(Response response){
        switch (response.statusCode()) {
            case 200:
                MatcherAssert.assertThat(response.jsonPath().getList("nobelPrizes"), instanceOf(List.class));
                // More detailed checks for the expected structure of the payload go here
                break;
            case 400:
            case 404:
            case 422:
                MatcherAssert.assertThat(response.jsonPath().get("code"), instanceOf(String.class));
                MatcherAssert.assertThat(response.jsonPath().get("message"), instanceOf(String.class));
                break;
            default:
                throw new IllegalStateException("Unexpected response status code:" + response.statusCode());
        }
    }
}
