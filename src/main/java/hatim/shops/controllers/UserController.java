package hatim.shops.controllers;

import hatim.shops.entities.User;
import hatim.shops.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class UserController {

    private String mail = "hatim@mail.com";

    @Autowired
    UserServices userServices;

    @RequestMapping(method = RequestMethod.POST, value="/signup")
    public void register(@RequestBody User user){
        userServices.register(user);
    }

    @RequestMapping(value="/home")
    public User getHome(){
        User testuser= new User();
        testuser.setEmail("hatim");
        return testuser;
    }

    public boolean isCorrectLogin(String mail){
        return this.mail.equals(mail);
    }
}
