package rcpya.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rcpya.demo.models.User;
import rcpya.demo.services.UserServices;

import java.util.List;


@RestController
public class UserController {

    @Autowired
    private UserServices userSVC;

    @GetMapping("/admin")
    public String getUser(Model model){
        try {
            List<User> users = this.userSVC.findAll();
            model.addAttribute("users", users);
            return "views/users";
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
            return "error: "+e.getMessage();
        }
    }

    @RequestMapping("/users")
    public List<User> Users(){
        List<User> all = null;
        try {
            all = this.userSVC.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return all;
    }
}
