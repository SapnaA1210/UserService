package dev.Sapna.EcomUserService.repository;

import dev.Sapna.EcomUserService.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepository extends JpaRepository<User,Integer> {

}
