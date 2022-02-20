package pl.tomcki.serwis_biuro_podrozy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class City {

				@Id
				@GeneratedValue(strategy = GenerationType.IDENTITY)
				private Long idCity;
				private String cityName;
				private String country;
				@OneToMany(mappedBy = "city")
				private Set<TripCityPoint> tripCityPoints;

}
