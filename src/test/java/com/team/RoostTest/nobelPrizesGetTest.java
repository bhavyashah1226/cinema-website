// Test generated by RoostGPT for test restAssuredTest using AI Type Azure Open AI and AI Model roost-gpt4-32k

// RoostTestHash=4940f5c55b

package com.team.RoostTest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.*;

public class nobelPrizesGetTest {

    private Map<String, String> testData; 

    @BeforeClass
    public void prepareTestData() throws IOException {
        RestAssured.baseURI = System.getenv("BASE_URL");  
        testData = new HashMap<>();
        Thread.currentThread().getContextClassLoader().getResource("nobelPrizes_get.csv");
  
        // Read CSV file  
        try (BufferedReader reader = new BufferedReader(new FileReader("src/test/java/com/team/RoostTest/nobelPrizes_get.csv"))) {  
            String headerLine = reader.readLine();  
            String[] headers = headerLine.split(",");  
  
            String line;  
            while ((line = reader.readLine()) != null) {  
                String[] data = line.split(",");  
  
                // Create a map of header to data
                for (int i = 0; i < headers.length; i++) {  
                    testData.put(headers[i], data[i]);  
                } 
            }
        }
    }

    @Test  
    public void nobelPrizes_get_Test() {  
                
        given()
            .queryParams(testData)
            .when()
            .get("/nobelPrizes")  
            .then() 
            .assertThat()  
            .statusCode(anyOf(equalTo(200), equalTo(400), equalTo(404)))
            .contentType(ContentType.JSON)
            .body("$", notNullValue());
    }
}
