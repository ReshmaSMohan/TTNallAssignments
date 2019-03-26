package springsession.springthymleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value = "/q1")
    public String question1(){
        return "question1";
    }

    @RequestMapping(value = "/q2")
    public String question2(){
        return "question2";
    }
}
