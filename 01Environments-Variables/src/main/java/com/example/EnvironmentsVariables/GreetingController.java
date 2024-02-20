package com.example.EnvironmentsVariables;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Autowired
    Environment environment;

    @Value("${myCustomVarTree.devName}")
    String devName;

    @Value("${myCustomVarTree.authCode}")
    String authCode;



    @GetMapping("/getProperty")
    public String getProperty(){
        String greeting = "Hello " + devName + " ,authCode: " + authCode;
        return greeting;
    }

}
