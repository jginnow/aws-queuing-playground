package com.ginnow.awsqueuingplayground.controller.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @GetMapping(path = "/hello-world")
    public ResponseEntity<String> helloWorld(){
        return new ResponseEntity<String>("Hello World", HttpStatus.OK);
    }
    
}
