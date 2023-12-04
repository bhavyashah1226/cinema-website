// Test generated by RoostGPT for test restAssuredTest using AI Type Azure Open AI and AI Model roost-gpt4-32k

// Test generated for /logout_post for http method type POST in rest-assured framework

// RoostTestHash=64d33906e5

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

public class logoutPostTest {
  
    @Test  
    public void logout_post_Test() {  
        RestAssured.baseURI = System.getenv("BASE_URL");  
  
        try (BufferedReader reader = new BufferedReader(new FileReader("src/test/java/com/team/RoostTest/logout_post.csv"))) {  

            String headerLine = reader.readLine();  
            String[] headers = headerLine.split(",");
  
            while (reader.ready()) {  
                String[] data = reader.readLine().split(",");
  
                Map<String, String> requestData = new HashMap<>();
                for (int i = 0; i < headers.length; i++) {  
                    requestData.put(headers[i], data[i]);  
                }  

                Response response = given()
                                    .contentType(ContentType.JSON)
                                    .body(requestData)
                                    .when()
                                    .post("/logout")
                                    .then() 
                                    .extract().response();  
          
                switch(response.statusCode()){
                    case 200:
                        System.out.println("Description: successful operation");
                        break;
                    case 400:
                        System.out.println("Description: Bad Request");
                        validateBadRequest(response);
                        break;
                    default:
                        System.out.println("Unrecognized status code: " + response.statusCode());
                } 
            }  
        } catch (IOException e) {  
            e.printStackTrace();
        }  
    }

    private void validateBadRequest(Response response){
        assertEquals("Unexpected error message", "Bad Request", response.jsonPath().get("message"));
        assertNotNull("Exception is null", response.jsonPath().get("exception"));
    }
}
