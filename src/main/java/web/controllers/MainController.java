package web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import web.domains.Bird;

import java.util.Random;

@Controller
@RequestMapping("main")
public class MainController {

    public MainController() {
        System.out.println("Main controller created...");
    }

    @RequestMapping(value = "get-some-data", method = RequestMethod.POST)
    @ResponseBody
    public String[] getSomeData(int param1, double param2, String param3) {
        System.out.println("Controller method invoked...");
        System.out.println("param1 = " + param1 + "\tparam2 = " + param2 + "\tparam3 = " + param3);
        return new String[] {"1", "22", "333", "4444", "55555"};
    }

    @RequestMapping(value = "add-bird", method = RequestMethod.PUT)
    @ResponseBody
    public Bird addBird(String name) {

        Bird bird = new Bird();
        bird.setName(name);
        bird.setId(new Random().nextInt(50));
        return bird;
    }
}
