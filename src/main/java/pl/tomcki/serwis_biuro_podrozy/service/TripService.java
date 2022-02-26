package pl.tomcki.serwis_biuro_podrozy.service;

import com.sun.xml.bind.v2.TODO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.tomcki.serwis_biuro_podrozy.model.Trip;
import pl.tomcki.serwis_biuro_podrozy.repository.TripRepository;

import java.util.Optional;

@Service

public class TripService {
				public final TripRepository tripRepository;

				@Autowired
				public TripService(TripRepository tripRepository) {
								this.tripRepository = tripRepository;
				}
//TODO
//				public Iterable<Trip> showAllTrip() {
//								return TripRepository.findAll();
//				}

				public Optional<Trip> findTripById(Long idTrip) {
								return tripRepository.findById(idTrip);
				}

				public void deleteTripById(Long idTrip) {
								tripRepository.deleteById(idTrip);
				}

//TODO				public void saveItem() {
//								tripRepository.deleteById();
//				}
}
