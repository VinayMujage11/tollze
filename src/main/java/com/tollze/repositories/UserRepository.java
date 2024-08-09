package com.tollze.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.tollze.entities.User;
public interface UserRepository extends JpaRepository<User, Integer> {
	public  User findByEmail(String email);
	public User findByUserId(String userId);
	//public void deleteByuserId(String userId);
}
