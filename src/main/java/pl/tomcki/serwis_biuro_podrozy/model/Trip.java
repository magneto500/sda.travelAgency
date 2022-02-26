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
				@GeneratedValue(strategy = GenerationType.IDENTITY)
				private Long idTrip;
				private String descriptionTrip;
				private LocalDate departureDate;
				private LocalDate returnDate;
				private BigDecimal adultPrice;
				private BigDecimal childPrice;
				private String feedingType;
				@ManyToOne
				private City toCity;
				@ManyToOne
				private City fromCity;
				@OneToMany(mappedBy = "trip")
				private Set<TripCityPoint> cities;
				@OneToMany(mappedBy = "trip")
				private Set<TripBuying> tripBuying;



}

