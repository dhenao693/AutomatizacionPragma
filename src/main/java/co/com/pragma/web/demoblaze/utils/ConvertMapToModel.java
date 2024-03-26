package co.com.pragma.web.demoblaze.utils;



import co.com.pragma.web.demoblaze.models.User;

import java.util.Map;

public class ConvertMapToModel {
    public static User convertMapToUser(Map<String, String> map) {
        return User.builder()
                .username(map.get("username"))
                .password(map.get("password"))
                .build();

    }
}
