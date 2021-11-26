package steps;

import RestSpecs.RestSpecs;
import io.cucumber.java.ru.Когда;
import model.SignInRequest;
import utils.PojoToJsonConvertor;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import static io.restassured.RestAssured.given;

public class SignInStepDef {

    private SignInRequest signInRequest = new SignInRequest();

    @Когда("попробуем отправит код")
    public void попробуемОтправитКод() throws NoSuchAlgorithmException {

        given().
                spec(RestSpecs.getRequestSpecs(PojoToJsonConvertor.pojoToJsonString(signInRequest)))
                .body(signInRequest)
                .post("/auth/in")
                .then().assertThat().statusCode(200).log().body();
    }
}
