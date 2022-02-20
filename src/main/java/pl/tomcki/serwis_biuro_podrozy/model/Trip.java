package pl.tomcki.serwis_biuro_podrozy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Trip {

				@Id
				@GeneratedValue(strategy = GenerationType.AUTO)
				private Long idtrip;
				private String descriptionTrip;
				private LocalDate departureDate;
				private LocalDate returnDate;
				private Integer timeTrip;
				private BigDecimal adultPrice;
				private BigDecimal childPrice;
				private String feedingType;
				@ManyToOne
				private City toCity;
				@ManyToOne
				private City fromCity;
				@OneToMany(mappedBy = "trip")
				private Set<TripCityPoint> cities;
				@ManyToOne
				private TripBuying tripBuying;

}
