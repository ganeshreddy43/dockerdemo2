package com.neotericdockerdemo2.dockerdemo2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
@GetMapping("/dockerdemo")
    public  String dockerDemo(){
        return " dockerDemo";
    }
}
