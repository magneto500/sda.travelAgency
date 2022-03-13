package pl.tomcki.serwis_biuro_podrozy.service;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.tomcki.serwis_biuro_podrozy.Dto.Trip.TripCreateRequestDto;
import pl.tomcki.serwis_biuro_podrozy.Dto.Trip.TripDto;
import pl.tomcki.serwis_biuro_podrozy.Dto.Trip.TripSearchDto;
import pl.tomcki.serwis_biuro_podrozy.model.City;
import pl.tomcki.serwis_biuro_podrozy.model.Trip;
import pl.tomcki.serwis_biuro_podrozy.repository.CityRepository;
import pl.tomcki.serwis_biuro_podrozy.repository.TripRepository;

import javax.persistence.EntityNotFoundException;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TripService {
				public final TripRepository tripRepository;
				public final CityRepository cityRepository;


				public List<TripDto> showAllTrips() {
								return tripRepository.findAll().stream()
																.map(TripDto::mapFromTrip)
																.collect(Collectors.toList());
				}

				public void deleteById(Long idTrip) {
								tripRepository.deleteById(idTrip);
				}

				public void saveItem(TripCreateRequestDto request) {
								Trip createdTrip = Trip.builder()
																.idTrip(request.getIdTrip())
																.descriptionTrip(request.getDescriptionTrip())
																.departureDate(request.getDepartureDate())
																.returnDate(request.getReturnDate())
																.adultPrice(request.getAdultPrice())
																.feedingType(request.getFeedingType())
																.build();
								tripRepository.save(createdTrip);
				}

				public TripDto findTripById(Long idTrip) {
								Optional<Trip> tripOptional = tripRepository.findById(idTrip);
								if (tripOptional.isPresent()) {
												Trip trip = tripOptional.get();
												return TripDto.mapFromTrip(trip);
								}
								throw new EntityNotFoundException("Didn't find trip with id: " + idTrip);
				}

				public void updateItem(Long idTrip, TripCreateRequestDto request) {
								Optional<Trip> tripOptional = tripRepository.findById(idTrip);
								if (tripOptional.isPresent()) {
												Trip trip = tripOptional.get();
												trip.setDescriptionTrip(request.getDescriptionTrip());
												trip.setDepartureDate(request.getDepartureDate());
												trip.setReturnDate(request.getReturnDate());
												trip.setAdultPrice(request.getAdultPrice());
												trip.setFeedingType(request.getFeedingType());
												tripRepository.save(trip);
								}
								throw new EntityNotFoundException("Didn't find trip with id: " + idTrip);
				}

				public List<TripDto> searchBy(TripSearchDto request) {
								Optional<City> cityOptional = cityRepository.findByCityName(request.getCityStart());
								if(cityOptional.isPresent()) {
												City city = cityOptional.get();

												List<Trip> trips = tripRepository.findAllByAdultPriceBetweenAndDepartureDateBetweenAndFromCityAndDescriptionTrip(
																				BigDecimal.valueOf(request.getPriceFrom()),
																				BigDecimal.valueOf(request.getPriceTo()),
																				request.getDateStartFrom(),
																				request.getDateStartTo(),
																				city,
																				request.getTripDescription()
																				);
												return trips.stream()
																				.map(TripDto::mapFromTrip)
																				.collect(Collectors.toList());
								}
								throw new EntityNotFoundException("Can't find city: " + request.getCityStart());
				}
}
