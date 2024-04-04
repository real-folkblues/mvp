package org.launchcode.mvp.data;


import org.launchcode.mvp.models.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    // Method to find a user by username

    Optional findByUsername( String username);
}

