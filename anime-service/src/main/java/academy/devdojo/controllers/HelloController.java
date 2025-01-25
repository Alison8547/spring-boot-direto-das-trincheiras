package academy.devdojo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @RequestMapping(value = "greeting")
public class HelloController {

    @GetMapping(value = {"hi", "hi/"})
    public String hi() {
        return "Go Ohsatsu";
    }
}
