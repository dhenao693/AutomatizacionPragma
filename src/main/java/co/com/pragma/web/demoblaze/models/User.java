package co.com.pragma.web.demoblaze.models;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
@Builder
public class User {
    private String username;
    private String password;
}
