package pl.tomcki.serwis_biuro_podrozy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.tomcki.serwis_biuro_podrozy.model.Trip;

public interface TripAppRepository extends JpaRepository<Trip, Long> {
}
