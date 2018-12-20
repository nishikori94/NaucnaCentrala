package project.nc.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import project.nc.model.Casopis;

public interface CasopisRepository extends JpaRepository<Casopis, Long>{

	Optional<Casopis> findById(Long id);
	
}
