package academy.devdojo.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ThreadLocalRandom;

@RestController
// @RequestMapping(value = "greeting")
public class HelloController {

    private static final Logger log = LogManager.getLogger(HelloController.class);

    @GetMapping(value = {"hi", "hi/"})
    public String hi() {
        return "Go Ohsatsu";
    }

    @PostMapping("save")
    public Long save(@RequestBody String name) {
        log.info("save {}", name);
        return ThreadLocalRandom.current().nextLong(1, 100);
    }
}
