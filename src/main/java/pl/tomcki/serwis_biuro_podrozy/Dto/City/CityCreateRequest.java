package pl.tomcki.serwis_biuro_podrozy.Dto.City;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// Ta klasa wykorzystywana jest wyłącznie do przyjmowania requestów o stworzenie obiektu
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CityCreateRequest {
				private String cityName;
				private String country;
}
