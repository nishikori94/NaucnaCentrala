package project.nc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project.nc.model.Korisnik;

public interface KorisnikRepository extends JpaRepository<Korisnik, Long> {

}
