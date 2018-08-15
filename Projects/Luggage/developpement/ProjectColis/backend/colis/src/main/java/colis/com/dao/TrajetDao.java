package colis.com.dao;


import colis.com.entities.trajets.Trajet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrajetDao extends JpaRepository<Trajet, Long> {
}
