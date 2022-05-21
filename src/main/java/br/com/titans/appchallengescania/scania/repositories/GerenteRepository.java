package br.com.titans.appchallengescania.scania.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.titans.appchallengescania.scania.model.Gerente;

@Repository
public interface GerenteRepository extends JpaRepository<Gerente, Long> {

	
}
