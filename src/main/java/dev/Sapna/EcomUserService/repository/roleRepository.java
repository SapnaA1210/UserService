package dev.Sapna.EcomUserService.repository;

import dev.Sapna.EcomUserService.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface roleRepository extends JpaRepository<Role,Integer> {
}
