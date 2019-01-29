package project.nc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import project.nc.model.Rad;

public interface RadRepository extends JpaRepository<Rad, Long> {

	List<Rad> findAllByCasopisId(Long id);

}
