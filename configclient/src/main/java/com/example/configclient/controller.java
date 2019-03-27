package com.example.configclient;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class controller {

    @Value("${welcome.message}")
    String welcomeText;
    public String welcomeText()
    {
        System.out.println("inside welcome text" + welcomeText);
        return welcomeText;
    }
}
