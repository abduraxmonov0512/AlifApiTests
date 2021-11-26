package RestSpecs;

import constants.Endpoints;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import utils.HashHelper;
import utils.PojoToJsonConvertor;

import java.security.NoSuchAlgorithmException;

public class RestSpecs {
    public static RequestSpecification getRequestSpecs(String body) throws NoSuchAlgorithmException {
        return new RequestSpecBuilder()
                .setBaseUri(Endpoints.BASE_URL)
                .setContentType(ContentType.JSON)
                .setAccept(ContentType.JSON)
                .addHeader("Request-Hash", HashHelper.calcHmacSha256("Signature", body))
                .log(LogDetail.ALL)
                .addFilter(new AllureRestAssured())
                .build();
    }
}
