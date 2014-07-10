package ru.arthur.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.arthur.entities.User;

@Controller
@RequestMapping(value = "/", method = RequestMethod.GET)
public class UserController {



        public String listUsers(ModelMap model) {
            model.addAttribute("user", new User());
                        return "users";
        }

   /*     @RequestMapping(value = "/add", method = RequestMethod.POST)
        public String addUser(@ModelAttribute("user") User user, BindingResult result) {



            return "redirect:/";
        }

        @RequestMapping("/delete/{userId}")
        public String deleteUser(@PathVariable("Id") String Id) {

           // userRepository.delete(userRepository.findOne(userId));

            return "redirect:/";
        }
*/
}
