package ru.arthur.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.arthur.entities.User;

/**
 * Created by salimhanov on 11.07.2014.
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping(method = RequestMethod.GET, params = "new")
    public String createUser(Model model){
        model.addAttribute(new User());
        return "user/edit";
    }
    @RequestMapping(method = RequestMethod.POST)
    public String addUserFromForm(@Validated User user, BindingResult bindingResult){
        if(bindingResult.hasErrors()) {
            return "user/edit";
        } else {

            // spitterService.saveSpitter(spitter);
            return "redirect:/user/"+user.getLogin();
        }
    }

    @RequestMapping(value = "/{login}", method = RequestMethod.GET)
    public String showUserProfile(@PathVariable String login, Model model){
         // model.addAttribute()
        return "user/view";
    }




}
