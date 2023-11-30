// Test generated by RoostGPT for test restAssuredTest using AI Type Azure Open AI and AI Model roost-gpt4-32k

// RoostTestHash=6dd436357d

package com.team.RoostTest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import org.hamcrest.MatcherAssert;
import static org.hamcrest.Matchers.*;

public class mePatchTest {
  
    @Test  
    public void me_patch_Test() {  
        RestAssured.baseURI = System.getenv("BASE_URL");  
  
        // Read CSV file  
        try (BufferedReader reader = new BufferedReader(new FileReader("src\test\java\com\team\RoostTest\me_patch.csv"))) {  
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
				.contentType(ContentType.JSON)
				.body("{\n"+
					"  \"name\": \"" + map.get("name") + "\",\n" +
					"  \"image\": \"" + map.get("image") + "\",\n" +
					"  \"settings\": \"" + map.get("settings") + "\n" +
 				"}")
                .when()
                .patch("/me")  
                .then() 
                .extract().response();    
         
                if (response.statusCode() == 200) {

            if (response.jsonPath().get("id") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("id"), instanceOf(String.class));
          }

            if (response.jsonPath().get("did") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("did"), instanceOf(String.class));
          }

            if (response.jsonPath().get("name") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("name"), instanceOf(String.class));
          }

            if (response.jsonPath().get("image") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("image"), instanceOf(String.class));
          }

            if (response.jsonPath().get("email") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("email"), instanceOf(String.class));
          }

            if (response.jsonPath().get("settings") != null) {
          }

            if (response.jsonPath().get("createdAt") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("createdAt"), instanceOf(String.class));
          }

            if (response.jsonPath().get("updatedAt") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("updatedAt"), instanceOf(String.class));
          }
}
if (response.statusCode() == 400) {
}
if (response.statusCode() == 401) {
}
  
            }  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }
}