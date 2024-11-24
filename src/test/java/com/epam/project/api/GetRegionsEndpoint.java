package com.epam.project.api;

import io.restassured.response.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.epam.project.api.Endpoints.REGION;
import static com.epam.project.framework.loging.Log.logInfoMessage;
import static com.epam.project.framework.properties.EnvironmentProperty.getEnv;
import static io.restassured.RestAssured.given;

public class GetRegionsEndpoint {

    @Test
    public void verifyGetRegions() {
        logInfoMessage("Starting get products test");
        Response response = given()
                .baseUri(getEnv())
                .header("Content-Type", "application/json")
                .when()
                .get(REGION);
        logInfoMessage("Response: " + response.getBody().asString());
        Assert.assertEquals(response.getStatusCode(), 200, "Incorrect status code");
    }
}