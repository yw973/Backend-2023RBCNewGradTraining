package com.yinglu.restApiApp.rest.Repo;

import com.yinglu.restApiApp.rest.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//import net.javaguides.springboot.model.User;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {
}
