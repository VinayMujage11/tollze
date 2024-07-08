package com.tollze.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.tollze.entities.User;
public interface UserRepository extends JpaRepository<User, Integer> {
	public  User findByEmail(String email);
}
