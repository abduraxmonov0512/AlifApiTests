package utils;

import com.google.gson.Gson;

public class PojoToJsonConvertor {
    public static String pojoToJsonString(Object  ob) {
        Gson gson = new Gson();
        String on = gson.toJson(ob);
        System.out.println(on);
        return on;
    }
}
