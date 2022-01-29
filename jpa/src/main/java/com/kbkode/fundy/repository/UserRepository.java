package com.kbkode.fundy.repository;

import com.kbkode.fundy.entity.users.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @date 24-May-2021
 * @author kbibby 
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long>{

}
