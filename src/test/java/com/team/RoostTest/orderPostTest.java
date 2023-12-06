// Test generated by RoostGPT for test restAssuredVertexAi using AI Type Vertex AI and AI Model code-bison-32k


// Test generated for /store/order_post for http method type POST in rest-assured framework


// RoostTestHash=036bac41de


package com.team.RoostTest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import org.hamcrest.MatcherAssert;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.text.*;

public class orderPostTest {
  
    @Test  
    public void order_post_Test() {  
        RestAssured.baseURI = System.getenv("BASE_URL");  
  
        // Read CSV file  
        try (BufferedReader reader = new BufferedReader(new FileReader("src/test/java/com/team/RoostTest/orderPostTest.csv"))) {  
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
				.pathParam("body", map.get("body"))
                .when()
                .post("/store/order")  
                .then() 
                .extract().response();    
         
                if (response.statusCode() == 200) {
					System.out.println("Description: successful operation");
  
            if (response.jsonPath().get("id") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("id"), instanceOf(Integer.class));
                MatcherAssert.assertThat(response.jsonPath().getString("id"), Number.isSafeInteger(
                  response.jsonPath().getInt("id")
                )); 
  
          }
  
            if (response.jsonPath().get("petId") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("petId"), instanceOf(Integer.class));
                MatcherAssert.assertThat(response.jsonPath().getString("petId"), Number.isSafeInteger(
                  response.jsonPath().getInt("petId")
                )); 
  
          }
  
            if (response.jsonPath().get("quantity") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("quantity"), instanceOf(Integer.class));  
          }
  
            if (response.jsonPath().get("shipDate") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("shipDate"), instanceOf(String.class));  
          }
  
            if (response.jsonPath().get("status") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("status"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("status"), anyOf(equalTo("placed"), equalTo("approved"), equalTo("delivered")));
  
          }
  
            if (response.jsonPath().get("complete") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("complete"), instanceOf(Boolean.class));  
          }
				}
if (response.statusCode() == 400) {
					System.out.println("Description: Invalid Order");
				}
  
            }  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }
}
