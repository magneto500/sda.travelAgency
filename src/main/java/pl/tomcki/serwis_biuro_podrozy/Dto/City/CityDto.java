package pl.tomcki.serwis_biuro_podrozy.Dto.City;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.tomcki.serwis_biuro_podrozy.model.City;

// Klasa wykorzystywana jest do wysyłania na front obiektów które będziemy wyświetlać
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CityDto {
				private Long idCity;
				private String cityName;
				private String country;

				public static CityDto mapFromCity(City city) {
								return CityDto.builder()
																.idCity(city.getIdCity())
																.cityName(city.getCityName())
																.country(city.getCountry())
																.build();
				}
}
