package br.com.nivi.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.nivi.auth.domain.Authority;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, String> {

	Authority findByName(String name);

}