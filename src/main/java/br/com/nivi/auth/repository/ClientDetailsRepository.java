package br.com.nivi.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.nivi.auth.domain.BaseClientDetails;

public interface ClientDetailsRepository extends JpaRepository<BaseClientDetails, String> {

}
