package br.com.nivi.auth;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.nivi.auth.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findByUsername(String username);
}
