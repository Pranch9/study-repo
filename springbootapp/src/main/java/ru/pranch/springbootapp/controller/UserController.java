package ru.pranch.springbootapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.pranch.springbootapp.model.Book;
import ru.pranch.springbootapp.model.User;
import ru.pranch.springbootapp.repository.UserRepository;
import ru.pranch.springbootapp.service.BookService;
import ru.pranch.springbootapp.service.UserService;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private BookService bookService;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserService userService;


    @GetMapping(value = "/hello")
    public String hello(Model model) {
        return "hello";
    }

    @GetMapping(value = "/books")
    public String findAllBooks(Model model) {
        List<Book> books = bookService.findAll();
        model.addAttribute("books", books);
        return "book-list";
    }

    @GetMapping(value = "/users")
    public String findAllUsers(Model model) {
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "user-list";
    }

    @PostMapping("filter")
    public String filter(@RequestParam String filter, Model model) {
        Iterable<User> users;
        if (filter != null && !filter.isEmpty()) {
            users = userRepository.findByUsername(filter);
        } else {
            users = userRepository.findAll();
        }
        model.addAttribute("users", users);
        return "user-list";
    }

    @GetMapping("/user-create")
    public String createUserForm(User user) {
        return "user-create";
    }

    @PostMapping("/user-create")
    public String createUser(User user) {
        userService.saveUser(user);
        return "redirect:/users";
    }

    @GetMapping("user-delete/{id}")
    public String deleteUser(@PathVariable("id") Long id) {
        userService.deleteById(id);
        return "redirect:/users";
    }

    @GetMapping("/user-update/{id}")
    public String updateUserForm(@PathVariable("id") Long id, Model model) {
        User user = userService.findById(id);
        model.addAttribute("user", user);
        return "/user-update";
    }

    @PostMapping("/user-update")
    public String updateUser(User user) {
        userService.saveUser(user);
        return "redirect:/users";
    }
}
