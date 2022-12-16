package br.com.actionsys.kwemailapimidas;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

@SpringBootApplication
public class KwemailApimidasApplication {

    public static void main(String[] args) {
        SpringApplication.run(KwemailApimidasApplication.class, args);

    }

}
