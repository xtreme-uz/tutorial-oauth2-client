package uz.xtreme.oauth2resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableResourceServer
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class Oauth2ResourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Oauth2ResourceApplication.class, args);
    }

}
