package pl.tomcki.serwis_biuro_podrozy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TripCityPoint {
				@Id
				@GeneratedValue(strategy = GenerationType.IDENTITY)
				private Long id;
				private Integer orderPosition;
				@ManyToOne
				private Trip trip;
				@ManyToOne
				private City city;
}
