package pl.tomcki.serwis_biuro_podrozy.Dto.Trip;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.tomcki.serwis_biuro_podrozy.model.Trip;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TripDto {
				private Long idTrip;
				private String descriptionTrip;
				private LocalDate departureDate;
				private LocalDate returnDate;
				private BigDecimal adultPrice;
				private BigDecimal childPrice;
				private String feedingType;

				public static TripDto mapFromTrip(Trip trip) {
								return TripDto.builder()
																							.idTrip(trip.getIdTrip())
																							.descriptionTrip(trip.getDescriptionTrip())
																							.departureDate(trip.getDepartureDate())
																							.returnDate(trip.getReturnDate())
																							.adultPrice(trip.getAdultPrice())
																							.childPrice(trip.getChildPrice())
																							.feedingType(trip.getFeedingType())
																.build();
				}
}
