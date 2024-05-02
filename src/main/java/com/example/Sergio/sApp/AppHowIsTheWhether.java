package com.example.Sergio.sApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class AppHowIsTheWhether {

    @GetMapping(path = "/ciao")

    public String hyStranger(@RequestParam String nome , @RequestParam String provincia){
        return "Ciao" + " " + nome + " , " + "com'è il tempo in" + " " + provincia;
    }


}
