package com.fluentWait.framework;

import org.testng.annotations.BeforeSuite;
import io.restassured.RestAssured;

/**
 * Created by vishnu4v5 on 7/19/2017.
 */
public class RestAssuredConfiguration {

    @BeforeSuite(alwaysRun = true)
    public void configure() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 8080;
        RestAssured.basePath = "/SprintRestServices";
    }

}
