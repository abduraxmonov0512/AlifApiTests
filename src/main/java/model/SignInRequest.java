package model;

import lombok.Data;

@Data
public class SignInRequest {

    private String phone;
    private String otp;
    private String pin;
    private String action;
    private String deviceId;
    private int osPlatform;


    public SignInRequest(){
        this.setAction("auth");
        this.setPhone("+998900269990");
        this.setOtp("");
        this.setDeviceId("E89A774A-3B6E-48CD-BD63-C3E26CE6CC5C");
        this.setOsPlatform(1);
    }

}
