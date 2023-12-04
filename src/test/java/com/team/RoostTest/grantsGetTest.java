// Test generated by RoostGPT for test restAssuredTest using AI Type Azure Open AI and AI Model roost-gpt4-32k

// Test generated for /grants_get for http method type GET in rest-assured framework

// RoostTestHash=692c6b853f

package com.team.RoostTest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Before;
import org.junit.Test;
import static io.restassured.RestAssured.get;
import static org.hamcrest.Matchers.equalTo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

public class grantsGetTest {

    private final String GRANTS_PATH = "/grants";
    private final String CSV_PATH = "src/test/java/com/team/RoostTest/grants_get.csv";
    private String baseURI;

    @Before
    public void setUp() {
        baseURI = System.getenv("BASE_URL");
        RestAssured.baseURI = baseURI;
    }

    @Test
    public void grants_get_Test() {
        Map<String, String> map = parseCsv();

        Response response = get(GRANTS_PATH).andReturn();
        if (response.statusCode() == 200) {
            System.out.println("Description: successful operation");
            validateResponse(response, map);
        } else if(response.statusCode() == 401) {
            System.out.println("Description: Authentication Required");
        } else {
            fail("Unexpected response status code: " + response.statusCode());
        }
    }

    private void validateResponse(Response response, Map<String, String> map) {
        for (String key : map.keySet()) {
            response.then()
                    .body(key, equalTo(map.get(key)));
        }
    }

    private Map<String, String> parseCsv() {
        try (BufferedReader reader = new BufferedReader(new FileReader(CSV_PATH))) {
            String headerLine = reader.readLine();
            String[] headers = headerLine.split(",");

            String line = reader.readLine();
            if (line != null) {
                String[] data = line.split(",");
                return arrayToMap(headers, data);
            }
        } catch (IOException e) {
            fail("Failed to parse CSV: " + e.getMessage());
        }
        return null;
    }

    private Map<String, String> arrayToMap(String[] keys, String[] values) {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < headers.length; i++) {
            map.put(headers[i], data[i]);
        }
        return map;
    }
}
