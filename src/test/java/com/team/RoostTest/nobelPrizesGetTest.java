// Test generated by RoostGPT for test restAssuredTest using AI Type Azure Open AI and AI Model roost-gpt4-32k

// RoostTestHash=4940f5c55b

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

public class nobelPrizesGetTest {

    @Test  
    public void nobelPrizes_get_Test() {  
        String baseUrl = System.getenv("BASE_URL");

        try (BufferedReader reader = getBufferReader()) {
            String line;  
            while ((line = reader.readLine()) != null) {  
                Map<String, String> map = getMappedData(line);
  
                Response response = setRestParameters(map).get("/nobelPrizes");   

                responseValidation(response, map);  
            }  
        } 
        catch (IOException e) {  
            System.out.println("Error reading file: " + e.getMessage());
        } 
    }   

    private BufferedReader getBufferReader() throws IOException {
        return new BufferedReader(new FileReader("src\\test\\java\\com\\team\\RoostTest\\nobelPrizes_get.csv"));
     }

    private Map<String, String> getMappedData(String line) {
        Map<String, String> map = new HashMap<>();
        String[] data = line.split(",");
        String[] headers = data[0].split(",");

        for (int i = 0; i < headers.length; i++) {   
            map.put(headers[i], data[i]);  
        }
        return map;
     }

     private RequestSpecification setRestParameters(Map<String, String> map) {
         return RestAssured.given().baseUri(baseUrl)
                .pathParam("offset", map.get("offset"))
                .pathParam("limit", map.get("limit"))
                .pathParam("sort", map.get("sort"))
                .pathParam("nobelPrizeYear", map.get("nobelPrizeYear"))
                .pathParam("yearTo", map.get("yearTo"))
                .pathParam("nobelPrizeCategory", map.get("nobelPrizeCategory"))
                .pathParam("format", map.get("format"))
                .pathParam("csvLang", map.get("csvLang"));
     }

     private void responseValidation(Response response, Map<String, String> map) {
         int statusCode = response.getStatusCode();
         if(statusCode == 200) {
             // validate successful response 
             validateResponse(response, map); 
         }
         else if (statusCode == 400 || statusCode == 404 || statusCode == 422) {
             validateErrorResponse(response);
         }
         else {
             System.out.println("Invalid Status Code: " + statusCode);
         }
     }

     private void validateResponse(Response response, Map<String,String> map) {
       //assertions for positive responses
    }

    private void validateErrorResponse (Response response) { 
       //assertions for negative responses
    }
}
