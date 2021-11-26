import com.google.gson.Gson;
import model.SignInRequest;
import utils.HashHelper;
import utils.PojoToJsonConvertor;

import java.security.NoSuchAlgorithmException;

public class Main {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        SignInRequest signInRequest = new SignInRequest();
        signInRequest.setAction("auth");
        signInRequest.setPhone("+998900269990");
       // signInRequest.setOtp("");
        signInRequest.setDeviceId("12312312312");

        System.out.println(HashHelper.calcHmacSha256("Signature", PojoToJsonConvertor.pojoToJsonString(signInRequest)));
    }
}
