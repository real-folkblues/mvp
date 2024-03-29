
//package org.launchcode.mvp.controllers;
//
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping (method = RequestMethod.GET)
//public class UserController {
//
//    @RequestMapping (name = "/home")
//    public String handleWelcome ( ) {
//        return "login";
//    }
//
//    @RequestMapping (value = "/admin/page")
//    public String handleAdmin ( ) {
//        return "admin/page";
//    }
//
//    @RequestMapping (value = "/user/page")
//    public String handleUser ( ) {
//        return "user/page";
//    }
//}
//
//
////    @Autowired
////    public UserController(UserService userService) {
////        this.userService = userService;
////    }
////
////    @PostMapping("/register")
////    public ResponseEntity<User> registerUser(@RequestBody UserRegistrationDto registrationDto) {
////        try {
////            User newUser = userService.registerUser(registrationDto.getUsername(), registrationDto.getPassword());
////            // Omit the password in the response for security reasons
////            newUser.setPassword(null);
////            return new ResponseEntity<>(newUser, HttpStatus.CREATED);
////        } catch (IllegalStateException e) {
////            // Handle the case where username is already in use
////            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
////        }
////    }
////
////    // In UserController.java
////
////    @PostMapping("/login")
////    public ResponseEntity<User> loginUser(@RequestBody LoginDto loginDto) {
////        try {
////            User authenticatedUser = userService.loginUser(loginDto.getUsername(), loginDto.getPassword());
////            // Omit the password in the response for security
////            authenticatedUser.setPassword(null);
////            return new ResponseEntity<>(authenticatedUser, HttpStatus.OK);
////        } catch (IllegalStateException e) {
////            // Handle invalid credentials
////            return new ResponseEntity<>(null, HttpStatus.UNAUTHORIZED);
////        }
////    }
//
//    // Additional endpoints like login, delete, update, etc., can be implemented as needed
//
=======
package org.launchcode.mvp.controllers;

import org.apache.catalina.User;
import org.launchcode.mvp.dto.LoginDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public <UserService> UserController ( UserService userService ) {
        this.userService = (org.launchcode.mvp.controllers.UserService) (org.launchcode.mvp.controllers.UserService) userService;
    }


    @RequestMapping (name = "/home")
    public String handleWelcome ( ) {
        return "login";
    }

    @RequestMapping (value = "/admin/page")
    public String handleAdmin ( ) {
        return "admin/page";
    }

    @RequestMapping (value = "/user/page")
    public String handleUser ( ) {
        return "user/page";
    }

    @PostMapping ("/login")
    public ResponseEntity <User> loginUser ( @RequestBody LoginDto loginDto ) {
        try {
            User authenticatedUser = userService.loginUser (loginDto.getUsername (), loginDto.getPassword ());
            // Omit the password in the response for security
            authenticatedUser.setPassword (null);
            return new ResponseEntity <> (authenticatedUser, HttpStatus.OK);
        } catch (IllegalStateException e) {
            // Handle invalid credentials
            return new ResponseEntity <> (null, HttpStatus.UNAUTHORIZED);
        }
    }

}
//    @Autowired
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }
//
//    @PostMapping("/register")
//    public ResponseEntity<User> registerUser(@RequestBody UserRegistrationDto registrationDto) {
//        try {
//            User newUser = userService.registerUser(registrationDto.getUsername(), registrationDto.getPassword());
//            // Omit the password in the response for security reasons
//            newUser.setPassword(null);
//            return new ResponseEntity<>(newUser, HttpStatus.CREATED);
//        } catch (IllegalStateException e) {
//            // Handle the case where username is already in use
//            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
//        }
//    }
//
//    // In UserController.java
//
    @PostMapping("/login")
    public ResponseEntity<User> loginUser(@RequestBody LoginDto loginDto) {
        try {
            User authenticatedUser = userService.loginUser(loginDto.getUsername(), loginDto.getPassword());
            // Omit the password in the response for security
            authenticatedUser.setPassword(null);
            return new ResponseEntity<>(authenticatedUser, HttpStatus.OK);
        } catch (IllegalStateException e) {
            // Handle invalid credentials
            return new ResponseEntity<>(null, HttpStatus.UNAUTHORIZED);
        }
    }

    // Additional endpoints like login, delete, update, etc., can be implemented as needed
bd36b1caeacba224549ed25fa5891e5636e5b77f
