package pl.pieshakelbery.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {

    @GetMapping(value = {"/index", "/"})
    public String getIndexPage(){
        return "index";
    }

}
