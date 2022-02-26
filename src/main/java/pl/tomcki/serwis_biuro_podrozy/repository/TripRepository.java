package pl.tomcki.serwis_biuro_podrozy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.tomcki.serwis_biuro_podrozy.model.City;
import pl.tomcki.serwis_biuro_podrozy.model.Trip;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Repository

public interface TripRepository extends JpaRepository<Trip, Long> {
				List<Trip> findAllByAdultPriceBetweenAndDepartureDateBetweenAndFromCityAndDescriptionTrip(BigDecimal from, BigDecimal to, LocalDate dateStartFrom,LocalDate dateStartTo, City fromCity,
																																																																																														String descriptionTrip);
}
