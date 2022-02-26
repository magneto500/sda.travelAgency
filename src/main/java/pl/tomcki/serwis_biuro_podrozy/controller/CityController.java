package pl.tomcki.serwis_biuro_podrozy.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.tomcki.serwis_biuro_podrozy.Dto.City.CityCreateRequest;
import pl.tomcki.serwis_biuro_podrozy.Dto.City.CityDto;
import pl.tomcki.serwis_biuro_podrozy.service.CityService;
import java.util.List;

//http://localhost:8080/trip/show
@RestController
@RequestMapping("/city")
public class CityController {


				public final CityService cityService;

				@Autowired
				public CityController(CityService cityService) {
								this.cityService = cityService;
				}

				@GetMapping("/show")
				public List<CityDto> showTrips() {
								return cityService.showAllCities();
				}

				@PostMapping("/add")
				public void saveCity(@RequestBody CityCreateRequest request) {
								cityService.saveItem(request);
				}

				@PostMapping("/update/{id}")
				public void saveModifiedCity(@PathVariable(name = "id") Long idCity, @RequestBody CityCreateRequest request) {
								cityService.updateItem(idCity, request);
				}

				@DeleteMapping("/delete/{id}")
				public void deleteById(@PathVariable(name = "id") Long idCity) {
								cityService.deleteCityById(idCity);
				}

				@GetMapping("/show/{id}")
				public CityDto findCityById(@PathVariable(name = "id") Long idCity) {
								return cityService.findCityById(idCity);
				}


}

