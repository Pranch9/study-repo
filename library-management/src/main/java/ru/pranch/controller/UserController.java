package ru.pranch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ru.pranch.model.User;
import ru.pranch.service.UserService;

@Controller
public class UserController {
    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView menuAuthorization() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("menu");
        return modelAndView;
    }
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView authorization(@ModelAttribute("user") User user){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/");
        return modelAndView;
    }
    @RequestMapping(value = "/mainmenu", method = RequestMethod.GET)
    public ModelAndView mainmenu() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("mainmenu");
        return modelAndView;
    }
}
