package pl.tomcki.serwis_biuro_podrozy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.tomcki.serwis_biuro_podrozy.model.City;

import java.util.Optional;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {
				Optional<City> findByCityName(String cityName);
}
