package pl.tomcki.serwis_biuro_podrozy.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.tomcki.serwis_biuro_podrozy.Dto.Trip.TripCreateRequest;
import pl.tomcki.serwis_biuro_podrozy.Dto.Trip.TripDto;
import pl.tomcki.serwis_biuro_podrozy.model.Trip;
import pl.tomcki.serwis_biuro_podrozy.repository.TripRepository;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TripService {
				public final TripRepository tripRepository;

				@Autowired
				public TripService(TripRepository tripRepository) {
								this.tripRepository = tripRepository;
				}

				public List<TripDto> showAllTrips() {
								return tripRepository.findAll().stream()
																.map(TripDto::mapFromTrip)
																.collect(Collectors.toList());
				}

				public void deleteById(Long idTrip) {
								tripRepository.deleteById(idTrip);
				}

				public void saveItem(TripCreateRequest request) {
								Trip createdTrip = Trip.builder()
																.idTrip(request.getIdTrip())
																.descriptionTrip(request.getDescriptionTrip())
																.departureDate(request.getDepartureDate())
																.returnDate(request.getReturnDate())
																.adultPrice(request.getAdultPrice())
																.childPrice(request.getChildPrice())
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

				public void updateItem(Long idTrip, TripCreateRequest request) {
								Optional<Trip> tripOptional = tripRepository.findById(idTrip);
								if (tripOptional.isPresent()) {
												Trip trip = tripOptional.get();
												trip.setDescriptionTrip(request.getDescriptionTrip());
												trip.setDepartureDate(request.getDepartureDate());
												trip.setReturnDate(request.getReturnDate());
												trip.setAdultPrice(request.getAdultPrice());
												trip.setChildPrice(request.getChildPrice());
												trip.setFeedingType(request.getFeedingType());
												tripRepository.save(trip);
								}
								throw new EntityNotFoundException("Didn't find trip with id: " + idTrip);
				}
}

