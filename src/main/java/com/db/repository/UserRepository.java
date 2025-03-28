package com.db.repository;
import com.db.entity.iUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<iUser, Long> {
    Optional<iUser> findByUsername(String username);
}
