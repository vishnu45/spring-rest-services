package com.fluentWait.test;

import com.fluentWait.test.common.EndPoint;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

/**
 * Created by vishnu4v5 on 7/19/2017.
 */
public class Employee {

    @Test
    public void validateEmployee() {
        given().get("http://localhost:8080/SprintRestServices/employee/getEmployee")
            .then().statusCode(200).log().all();
    }

    @Test(groups = "demo")
    public void validateEmployee2() {
        given().get(EndPoint.GET_EMPLOYEE)
            .then().statusCode(200).log().all();
    }

}
