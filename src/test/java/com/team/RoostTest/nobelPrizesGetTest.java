// Test generated by RoostGPT for test restAssured using AI Type Open AI and AI Model gpt-4


// Test generated for /nobelPrizes_get for http method type GET in rest-assured framework


// RoostTestHash=4940f5c55b


package com.team.RoostTest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class nobelPrizesGetTest {
  
    @Test  
    public void nobelPrizes_get_Test() {  
        RestAssured.baseURI = System.getenv("BASE_URL");  
  
        // Read CSV file  
        try (BufferedReader reader = new BufferedReader(new FileReader("src\test\java\com\team\RoostTest\nobelPrizesGetTest.csv"))) {  
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
				.pathParam("offset", map.get("offset") != null ? map.get("offset") : "")
				.pathParam("limit", map.get("limit") != null ? map.get("limit") : "")
				.pathParam("sort", map.get("sort") != null ? map.get("sort") : "")
				.pathParam("nobelPrizeYear", map.get("nobelPrizeYear") != null ? map.get("nobelPrizeYear") : "")
				.pathParam("yearTo", map.get("yearTo") != null ? map.get("yearTo") : "")
				.pathParam("nobelPrizeCategory", map.get("nobelPrizeCategory") != null ? map.get("nobelPrizeCategory") : "")
				.pathParam("format", map.get("format") != null ? map.get("format") : "")
				.pathParam("csvLang", map.get("csvLang") != null ? map.get("csvLang") : "")
                .when()
                .get("/nobelPrizes")  
                .then() 
                .extract().response();    
         
                if (response.statusCode() == 200) {
					System.out.println("Description: Successful call of Nobel Prize(s) according to the filled fields");
    
              if (response.jsonPath().get("nobelPrizes") != null) {    
                for (int i = 0; i < response.jsonPath().getList("nobelPrizes").size(); i++) {    
              if (response.jsonPath().get("nobelPrizes[`"+ i +"`].awardYear") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("nobelPrizes[`"+ i +"`].awardYear"), instanceOf(Integer.class));  
          }
    
              if (response.jsonPath().get("nobelPrizes[`"+ i +"`].category") != null) {    
              if (response.jsonPath().get("nobelPrizes[`"+ i +"`].category.en") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("nobelPrizes[`"+ i +"`].category.en"), instanceOf(String.class));  
          }
    
              if (response.jsonPath().get("nobelPrizes[`"+ i +"`].category.se") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("nobelPrizes[`"+ i +"`].category.se"), instanceOf(String.class));  
          }
    
              if (response.jsonPath().get("nobelPrizes[`"+ i +"`].category.false") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("nobelPrizes[`"+ i +"`].category.false"), instanceOf(String.class));  
          }
  
          }
    
              if (response.jsonPath().get("nobelPrizes[`"+ i +"`].categoryFullName") != null) {    
              if (response.jsonPath().get("nobelPrizes[`"+ i +"`].categoryFullName.en") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("nobelPrizes[`"+ i +"`].categoryFullName.en"), instanceOf(String.class));  
          }
    
              if (response.jsonPath().get("nobelPrizes[`"+ i +"`].categoryFullName.se") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("nobelPrizes[`"+ i +"`].categoryFullName.se"), instanceOf(String.class));  
          }
    
              if (response.jsonPath().get("nobelPrizes[`"+ i +"`].categoryFullName.false") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("nobelPrizes[`"+ i +"`].categoryFullName.false"), instanceOf(String.class));  
          }
  
          }
    
              if (response.jsonPath().get("nobelPrizes[`"+ i +"`].dateAwarded") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("nobelPrizes[`"+ i +"`].dateAwarded"), instanceOf(String.class));  
          }
    
              if (response.jsonPath().get("nobelPrizes[`"+ i +"`].prizeAmount") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("nobelPrizes[`"+ i +"`].prizeAmount"), instanceOf(Integer.class));  
          }
    
              if (response.jsonPath().get("nobelPrizes[`"+ i +"`].prizeAmountAdjusted") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("nobelPrizes[`"+ i +"`].prizeAmountAdjusted"), instanceOf(Integer.class));  
          }
    
              if (response.jsonPath().get("nobelPrizes[`"+ i +"`].topMotivation") != null) {    
              if (response.jsonPath().get("nobelPrizes[`"+ i +"`].topMotivation.en") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("nobelPrizes[`"+ i +"`].topMotivation.en"), instanceOf(String.class));  
          }
    
              if (response.jsonPath().get("nobelPrizes[`"+ i +"`].topMotivation.se") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("nobelPrizes[`"+ i +"`].topMotivation.se"), instanceOf(String.class));  
          }
    
              if (response.jsonPath().get("nobelPrizes[`"+ i +"`].topMotivation.false") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("nobelPrizes[`"+ i +"`].topMotivation.false"), instanceOf(String.class));  
          }
  
          }
    
              if (response.jsonPath().get("nobelPrizes[`"+ i +"`].laureates") != null) {    
                for (int i1 = 0; i1 < response.jsonPath().getList("nobelPrizes[`"+ i +"`].laureates").size(); i1++) {    
              if (response.jsonPath().get("nobelPrizes[`"+ i +"`].laureates[`"+ i1 +"`].id") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("nobelPrizes[`"+ i +"`].laureates[`"+ i1 +"`].id"), instanceOf(Integer.class));  
                MatcherAssert.assertThat(response.jsonPath().getDouble("nobelPrizes[`"+ i +"`].laureates[`"+ i1 +"`].id"), greaterThanOrEqualTo(1));
  
          }
    
              if (response.jsonPath().get("nobelPrizes[`"+ i +"`].laureates[`"+ i1 +"`].name") != null) {    
              if (response.jsonPath().get("nobelPrizes[`"+ i +"`].laureates[`"+ i1 +"`].name.en") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("nobelPrizes[`"+ i +"`].laureates[`"+ i1 +"`].name.en"), instanceOf(String.class));  
          }
    
              if (response.jsonPath().get("nobelPrizes[`"+ i +"`].laureates[`"+ i1 +"`].name.se") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("nobelPrizes[`"+ i +"`].laureates[`"+ i1 +"`].name.se"), instanceOf(String.class));  
          }
    
              if (response.jsonPath().get("nobelPrizes[`"+ i +"`].laureates[`"+ i1 +"`].name.false") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("nobelPrizes[`"+ i +"`].laureates[`"+ i1 +"`].name.false"), instanceOf(String.class));  
          }
  
          }
    
              if (response.jsonPath().get("nobelPrizes[`"+ i +"`].laureates[`"+ i1 +"`].portion") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("nobelPrizes[`"+ i +"`].laureates[`"+ i1 +"`].portion"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("nobelPrizes[`"+ i +"`].laureates[`"+ i1 +"`].portion"), anyOf(equalTo("1"), equalTo("1/2"), equalTo("1/3"), equalTo("1/4")));
  
          }
    
              if (response.jsonPath().get("nobelPrizes[`"+ i +"`].laureates[`"+ i1 +"`].sortOrder") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("nobelPrizes[`"+ i +"`].laureates[`"+ i1 +"`].sortOrder"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("nobelPrizes[`"+ i +"`].laureates[`"+ i1 +"`].sortOrder"), anyOf(equalTo("1"), equalTo("2"), equalTo("3")));
  
          }
    
              if (response.jsonPath().get("nobelPrizes[`"+ i +"`].laureates[`"+ i1 +"`].motivation") != null) {    
              if (response.jsonPath().get("nobelPrizes[`"+ i +"`].laureates[`"+ i1 +"`].motivation.en") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("nobelPrizes[`"+ i +"`].laureates[`"+ i1 +"`].motivation.en"), instanceOf(String.class));  
          }
    
              if (response.jsonPath().get("nobelPrizes[`"+ i +"`].laureates[`"+ i1 +"`].motivation.se") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("nobelPrizes[`"+ i +"`].laureates[`"+ i1 +"`].motivation.se"), instanceOf(String.class));  
          }
    
              if (response.jsonPath().get("nobelPrizes[`"+ i +"`].laureates[`"+ i1 +"`].motivation.false") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("nobelPrizes[`"+ i +"`].laureates[`"+ i1 +"`].motivation.false"), instanceOf(String.class));  
          }
  
          }
    
              if (response.jsonPath().get("nobelPrizes[`"+ i +"`].laureates[`"+ i1 +"`].links") != null) {    
                for (int i11 = 0; i11 < response.jsonPath().getList("nobelPrizes[`"+ i +"`].laureates[`"+ i1 +"`].links").size(); i11++) {    
              if (response.jsonPath().get("nobelPrizes[`"+ i +"`].laureates[`"+ i1 +"`].links[`"+ i11 +"`].rel") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("nobelPrizes[`"+ i +"`].laureates[`"+ i1 +"`].links[`"+ i11 +"`].rel"), instanceOf(String.class));  
          }
    
              if (response.jsonPath().get("nobelPrizes[`"+ i +"`].laureates[`"+ i1 +"`].links[`"+ i11 +"`].href") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("nobelPrizes[`"+ i +"`].laureates[`"+ i1 +"`].links[`"+ i11 +"`].href"), instanceOf(String.class));  
          }
    
              if (response.jsonPath().get("nobelPrizes[`"+ i +"`].laureates[`"+ i1 +"`].links[`"+ i11 +"`].action") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("nobelPrizes[`"+ i +"`].laureates[`"+ i1 +"`].links[`"+ i11 +"`].action"), instanceOf(String.class));  
          }
    
              if (response.jsonPath().get("nobelPrizes[`"+ i +"`].laureates[`"+ i1 +"`].links[`"+ i11 +"`].types") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("nobelPrizes[`"+ i +"`].laureates[`"+ i1 +"`].links[`"+ i11 +"`].types"), instanceOf(String.class));  
          }
    
                  }  
                MatcherAssert.assertThat(response.jsonPath().getList("nobelPrizes[`"+ i +"`].laureates[`"+ i1 +"`].links"), instanceOf(List.class));
  
          }
    
                  }  
                MatcherAssert.assertThat(response.jsonPath().getList("nobelPrizes[`"+ i +"`].laureates"), instanceOf(List.class));
  
          }
    
                  }  
                MatcherAssert.assertThat(response.jsonPath().getList("nobelPrizes"), instanceOf(List.class));
  
          }
    
              if (response.jsonPath().get("meta") != null) {    
              if (response.jsonPath().get("meta.offset") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("meta.offset"), instanceOf(Integer.class));  
          }
    
              if (response.jsonPath().get("meta.limit") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("meta.limit"), instanceOf(Integer.class));  
                MatcherAssert.assertThat(response.jsonPath().getDouble("meta.limit"), greaterThanOrEqualTo(1));
  
          }
    
              if (response.jsonPath().get("meta.nobelPrizeYear") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("meta.nobelPrizeYear"), instanceOf(Integer.class));  
          }
    
              if (response.jsonPath().get("meta.yearTo") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("meta.yearTo"), instanceOf(Integer.class));  
          }
    
              if (response.jsonPath().get("meta.nobelPrizeCategory") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("meta.nobelPrizeCategory"), instanceOf(String.class));  
          }
    
              if (response.jsonPath().get("meta.count") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("meta.count"), instanceOf(Integer.class));  
          }
  
          }
    
              if (response.jsonPath().get("links") != null) {    
                for (int i = 0; i < response.jsonPath().getList("links").size(); i++) {    
              if (response.jsonPath().get("links[`"+ i +"`].first") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("links[`"+ i +"`].first"), instanceOf(String.class));  
          }
    
              if (response.jsonPath().get("links[`"+ i +"`].prev") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("links[`"+ i +"`].prev"), instanceOf(String.class));  
          }
    
              if (response.jsonPath().get("links[`"+ i +"`].self") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("links[`"+ i +"`].self"), instanceOf(String.class));  
          }
    
              if (response.jsonPath().get("links[`"+ i +"`].next") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("links[`"+ i +"`].next"), instanceOf(String.class));  
          }
    
              if (response.jsonPath().get("links[`"+ i +"`].last") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("links[`"+ i +"`].last"), instanceOf(String.class));  
          }
    
                  }  
                MatcherAssert.assertThat(response.jsonPath().getList("links"), instanceOf(List.class));
  
          }
				}
if (response.statusCode() == 400) {
					System.out.println("Description: Bad request.The request could not be understood by the server due to malformed syntax, modifications needed.");
    
              if (response.jsonPath().get("code") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("code"), instanceOf(String.class));  
          }
    
              if (response.jsonPath().get("message") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("message"), instanceOf(String.class));  
          }
				}
if (response.statusCode() == 404) {
					System.out.println("Description: Not Found. The requested resource could not be found but may be available again in the future.");
    
              if (response.jsonPath().get("code") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("code"), instanceOf(String.class));  
          }
    
              if (response.jsonPath().get("message") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("message"), instanceOf(String.class));  
          }
				}
if (response.statusCode() == 422) {
					System.out.println("Description: Unprocessable Entity. The request was well-formed but was unable to be followed due to semantic errors.");
    
              if (response.jsonPath().get("code") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("code"), instanceOf(String.class));  
          }
    
              if (response.jsonPath().get("message") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("message"), instanceOf(String.class));  
          }
				}
  
            }  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }
}
