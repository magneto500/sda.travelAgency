package pl.tomcki.serwis_biuro_podrozy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.tomcki.serwis_biuro_podrozy.model.City;

public interface CityAppRepository extends JpaRepository<City, Long> {
}
