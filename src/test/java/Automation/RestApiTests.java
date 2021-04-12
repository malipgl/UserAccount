package Automation;

import Application.User.Entity.UserAccount;
import Application.User.UpdateDTO.UserAccountUpdateDTO;
import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;

import static UserTest.CreateFactory.EntityFactory.userAccount;
import static UserTest.CreateFactory.EntityFactory.userAccountUpdateDTO;
import static io.restassured.RestAssured.given;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class RestApiTests {

    @BeforeAll
    public void setUp(){
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
    }


    @Test
    public void createUserTest(){
        UserAccount userAccount = userAccount();
        given().
                header("Content-Type", "application/json").
                body(userAccount).
        when().
                post("http://localhost:8081/createUserAccount").
        then().
                statusCode(200);
    }

    @Test
    public void updateUserAccountTest(){
        UserAccountUpdateDTO updateUserAccountDTO = userAccountUpdateDTO();
        given().
                header("Content-Type", "application/json").
                body(updateUserAccountDTO).
        when().
                put("http://localhost:8081/updateUserAccount").
        then().
                statusCode(200);
    }

    @Test
    public void createFailsUserAccountTest(){
        UserAccount userAccount = userAccount();
        userAccount.setPhone(111111111111111L);

        given().
                header("Content-Type", "application/json").
                body(userAccount).
                when().
                post("http://localhost:8081/createUserAccount").
                then().
                statusCode(500);
    }

    @Test
    public void deleteUserAccountTest(){
        UserAccountUpdateDTO updateUserAccountDTO = userAccountUpdateDTO();
        given().
                header("Content-Type", "application/json").
        when().
                delete("http://localhost:8081/deleteUserAccount/1").
        then().
                statusCode(200);
    }



}
