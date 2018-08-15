package colis.com.dao;

import colis.com.entities.colis.Colis;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColisDao extends JpaRepository<Colis, Long> {

}
