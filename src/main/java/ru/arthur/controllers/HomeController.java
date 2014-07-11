package ru.arthur.controllers;

/**
 * Created by salimhanov on 11.07.2014.
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller

public class HomeController {
    @RequestMapping({"/","/home"})
    public String showHomePage(ModelMap model){

        return "home";

    }
}
