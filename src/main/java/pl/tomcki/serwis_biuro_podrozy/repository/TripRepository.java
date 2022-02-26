package pl.tomcki.serwis_biuro_podrozy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.tomcki.serwis_biuro_podrozy.model.Trip;
@Repository

public interface TripRepository extends JpaRepository<Trip, Long> {
}
