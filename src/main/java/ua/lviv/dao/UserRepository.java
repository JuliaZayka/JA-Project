package ua.lviv.dao;


import java.util.Optional; 

import org.springframework.data.jpa.repository.JpaRepository;

import ua.lviv.domain.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	public Optional<User> findByEmail(String email);
}