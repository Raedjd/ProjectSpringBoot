package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.esprit.spring.entity.Role;



public interface RoleRepository extends JpaRepository<Role, Long> {
	Role findByRole(String role);

}
