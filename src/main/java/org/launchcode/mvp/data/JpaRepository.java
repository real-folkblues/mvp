package org.launchcode.mvp.data;


import org.launchcode.mvp.models.User;
import org.springframework.stereotype.Repository;
@Repository
public interface JpaRepository extends org.springframework.data.jpa.repository.JpaRepository<User, Integer> {

    User findByUser(String username);

}