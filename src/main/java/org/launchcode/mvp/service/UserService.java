//package org.launchcode.mvp.service;
//
//import org.launchcode.mvp.data.UserRepository;
//import org.launchcode.mvp.models.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.stereotype.Service;
//import java.util.Optional;
//
//@Service
//public class UserService {
//
//    private final UserRepository userRepository;
//
//    // Automatically encrypts password
//    private final BCryptPasswordEncoder bCryptPasswordEncoder;
//
//    @Autowired
//    public UserService(UserRepository userRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
//        this.userRepository = userRepository;
//        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
//    }
//
//    // Method to register a new user
//    public User registerUser(String email, String password) {
//        // Check if user already exists
//        Optional<User> existingUser = userRepository.findByEmail(email);
//        if (existingUser.isPresent()) {
//            // Handle the case where user already exists, e.g., throw an exception or return null
//            throw new IllegalStateException("Email already in use.");
//        }
//
//        // Hash the password
//        String encodedPassword = bCryptPasswordEncoder.encode(password);
//
//        // Create a new user and save it in the database
//        User newUser = new User(email, encodedPassword);
//        return userRepository.save(newUser);
//    }
//
//
//
//    // Authenticate a user(login)
//    public User loginUser(String email, String password) {
//        Optional<User> user = userRepository.findByEmail(email);
//        if (user.isPresent() && bCryptPasswordEncoder.matches(password, user.get().getPassword())) {
//            return user.get();
//        } else {
//            throw new IllegalStateException("Invalid credentials");
//        }
//    }
//
//}
