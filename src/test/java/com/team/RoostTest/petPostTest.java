// Test generated by RoostGPT for test restAssuredVertexAi using AI Type Vertex AI and AI Model code-bison-32k


// Test generated for /pet_post for http method type POST in rest-assured framework


// RoostTestHash=16cf30f894


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

public class petPostTest {
  
    @Test  
    public void pet_post_Test() {  
        RestAssured.baseURI = System.getenv("BASE_URL");  
  
        // Read CSV file  
        try (BufferedReader reader = new BufferedReader(new FileReader("src/test/java/com/team/RoostTest/petPostTest.csv"))) {  
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
                .post("/pet")  
                .then() 
                .extract().response();    
         
                if (response.statusCode() == 405) {
					System.out.println("Description: Invalid input");
				}
  
            }  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }
}
