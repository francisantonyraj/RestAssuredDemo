package com.test;


import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;


public class Test {

    public static void main(String[] args) {
        getResponseBody();
    }

    public static void getResponseBody() {
        RequestSpecification httpRequest = RestAssured.given()
                .queryParam("CUSTOMER_ID", "68195")
                .queryParam("PASSWORD", "1234!")
                .queryParam("Account_No", "1");
        Response response = httpRequest.when()
                .get("http://demo.guru99.com/V4/sinkministatement.php");
        response.then().assertThat().statusCode(200);
        ResponseBody responseBody = response.getBody();
        String body = responseBody.prettyPrint();
        Assert.assertEquals(body.contains("Initial Deposit") , true );  
    }
}
