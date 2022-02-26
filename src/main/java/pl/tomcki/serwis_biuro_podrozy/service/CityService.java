package pl.tomcki.serwis_biuro_podrozy.service;

import org.springframework.stereotype.Service;
import pl.tomcki.serwis_biuro_podrozy.model.City;
import pl.tomcki.serwis_biuro_podrozy.model.dto.City.CityCreateRequest;
import pl.tomcki.serwis_biuro_podrozy.model.dto.City.CityDto;
import pl.tomcki.serwis_biuro_podrozy.repository.CityRepository;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CityService {

				public final CityRepository cityRepository;

				public CityService(CityRepository cityRepository) {
								this.cityRepository = cityRepository;
				}


				// zamieniamy zwracaną listę obiektów City (baza danych) -> CityDto
				public List<CityDto> showAllCities() {
								return cityRepository.findAll().stream()
																.map(CityDto::mapFromCity)
																.collect(Collectors.toList());
				}

				public void deleteCityById(Long idCity) {
								cityRepository.deleteById(idCity);
				}

				public void saveItem(CityCreateRequest request) {
								City createdCity = City.builder()
																.country(request.getCountry())
																.cityName(request.getCityName())
																.build();

								cityRepository.save(createdCity);
				}

				public CityDto findCityById(Long idCity) {
								Optional<City> cityOptional = cityRepository.findById(idCity);
								if(cityOptional.isPresent()){
												City city = cityOptional.get();
												return CityDto.mapFromCity(city);
								}
								throw new EntityNotFoundException("Didn't find city with id: "+ idCity);
				}


				public void updateItem(Long idCity, CityCreateRequest request) {
								Optional<City> cityOptional = cityRepository.findById(idCity);
								if(cityOptional.isPresent()) {
												City city = cityOptional.get();

												city.setCityName(request.getCityName());
												city.setCountry(request.getCountry());

												cityRepository.save(city);

								}
								throw new EntityNotFoundException("Didn't find city with id: "+ idCity);
				}
}

