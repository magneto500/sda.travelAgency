package pl.tomcki.serwis_biuro_podrozy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.tomcki.serwis_biuro_podrozy.Dto.Trip.TripCreateRequest;
import pl.tomcki.serwis_biuro_podrozy.Dto.Trip.TripDto;
import pl.tomcki.serwis_biuro_podrozy.service.TripService;

import java.util.List;

//http://localhost:8080/trip/show
@RestController
@RequestMapping("/trip")
public class TripController {


				public final TripService tripService;

				@Autowired
				public TripController(TripService tripService) {
								this.tripService = tripService;
				}


				@GetMapping("/show")
				public List<TripDto> showTrips() {
								return tripService.showAllTrips();
				}

				@PostMapping("/add")
				public void saveTrip(@RequestBody TripCreateRequest request) {
								tripService.saveItem(request);
				}

				@PostMapping("/update/{id}")
				public void saveModifiedTrip(@PathVariable(name = "id") Long idTrip, @RequestBody TripCreateRequest request) {
								tripService.updateItem(idTrip, request);
				}

				@DeleteMapping("/delete/{id}")
				public void deleteById(@PathVariable(name = "id") Long idTrip) {
								tripService.deleteById(idTrip);
				}

				@GetMapping("/show/{id}")
				public TripDto findCityById(@PathVariable(name = "id") Long idTrip) {
								return tripService.findTripById(idTrip);
				}


}

