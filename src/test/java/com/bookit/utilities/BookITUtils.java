package com.bookit.utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class BookITUtils {

    public static String generateToken(String email, String password){
        Response response = given().
                accept(ContentType.JSON)
                .queryParam("email", email)
                .queryParam("password", password)
                .when()
                .get(ConfigurationReader.get("apiUrl") + "/sign");

        String token = response.path("accessToken");

        String finalToken ="Bearer "+token;

        return  finalToken;

    }

    public static String[] getMYInfo(String email, String password){

        String[] myInfo = new String[3];

        for (int i = 0; i < 3; i++) {
            if(i==0){
                // get batch request
                // myInfo[i]=jsonPath.getstring
            }
            if (i == 1) {

                // get team request
            }

        }



    }

}
