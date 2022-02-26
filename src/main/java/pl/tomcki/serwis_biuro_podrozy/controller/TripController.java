package pl.tomcki.serwis_biuro_podrozy.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.tomcki.serwis_biuro_podrozy.model.Trip;
import pl.tomcki.serwis_biuro_podrozy.repository.TripRepository;
import pl.tomcki.serwis_biuro_podrozy.service.TripService;
import java.util.Optional;
//http://localhost:8080/trip/show
@RestController
@RequestMapping("/trip")
public class TripController {


				TripService tripService;

				@Autowired
				public TripController(TripService tripService) {
								this.tripService = tripService;
				}

				@GetMapping("/show")

//				TODO public String showTrip() {
//								tripService.showAllTrip();
//								return "/trip/show";
//				}

				@DeleteMapping("/delete/{id}")
				public String deleteById(@PathVariable Long idTrip) {
								tripService.deleteTripById(idTrip);
								return "/trip/delete";
				}

				@GetMapping("/show/{id}")
				public Optional<Trip> findTripById(@PathVariable Long idTrip) {
								return tripService.findTripById(idTrip);
				}

				@PostMapping("/add/{id}")
				public void saveModifiedTrip() {
//TODO								tripService.saveItem();
				};
}
