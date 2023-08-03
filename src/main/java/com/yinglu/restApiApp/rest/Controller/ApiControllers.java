package com.yinglu.restApiApp.rest.Controller;
import com.yinglu.restApiApp.rest.Models.User;
import com.yinglu.restApiApp.rest.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.annotation.RequestScope;

import java.util.List;

@RestController
//@RequestMapping("api/")
@CrossOrigin(origins = "http://localhost:3000")
//http://localhost:8080/
public class ApiControllers {
    //autowire handles dependency injection for us
    @Autowired
    private UserRepo userRepo;
//    @GetMapping(value="/")
//    public String getPage(){
//        return "Welcome";
//    }
    @GetMapping("/users")
    public List<User> getUsers(){
        return this.userRepo.findAll();
    }
//    @GetMapping(value="/users")
//    public List<User> getUsers(){
//        return this.userRepo.findAll();
//    }
    @PostMapping(value="/save")
    public String saveUser(@RequestBody User user){
        userRepo.save(user);
        return "Saved user information.";
    }
    //update
    @PutMapping (value="update/{id}")
    public String updateUser(@PathVariable long id, @RequestBody User user){
        User updatedUser=userRepo.findById(id).get();
        updatedUser.setFirstName(user.getFirstName());
        updatedUser.setLastName(user.getLastName());
        updatedUser.setOccupation(user.getOccupation());
        updatedUser.setAge(user.getAge());
        userRepo.save(updatedUser);
        return "updated user information.";
    }
    //delete
    @DeleteMapping(value="delete/{id}")
    public String deleteUser(@PathVariable long id){
        User deleteUser = userRepo.findById(id).get();
        userRepo.delete(deleteUser);
        return "Delete User id is: "+ id;
    }
}
