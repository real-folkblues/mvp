<<<<<<< HEAD
//package org.launchcode.mvp.data;
//
//import org.launchcode.mvp.models.Kanji;
//import org.springframework.stereotype.Repository;
//@Repository
//public interface JpaRepository extends org.springframework.data.jpa.repository.JpaRepository<Kanji, Long> {
//
//
//}
=======
package org.launchcode.mvp.data;


import org.launchcode.mvp.models.User;
import org.springframework.stereotype.Repository;
@Repository
public interface JpaRepository extends org.springframework.data.jpa.repository.JpaRepository<User, Integer> {

    User findByUser(String username);

}
>>>>>>> bd36b1caeacba224549ed25fa5891e5636e5b77f
