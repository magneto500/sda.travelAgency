package pl.tomcki.serwis_biuro_podrozy.Dto.Trip;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.cglib.core.Local;
import org.springframework.context.event.EventListener;
import pl.tomcki.serwis_biuro_podrozy.model.Trip;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

import static org.hibernate.hql.internal.antlr.HqlSqlTokenTypes.INSERT;
import static org.hibernate.hql.internal.antlr.HqlTokenTypes.INTO;

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
				private String feedingType;
				private Integer durationTime;

				public static TripDto mapFromTrip(Trip trip) {
								return TripDto.builder()
																.idTrip(trip.getIdTrip())
																.descriptionTrip(trip.getDescriptionTrip())
																.departureDate(trip.getDepartureDate())
																.returnDate(trip.getReturnDate())
																.adultPrice(trip.getAdultPrice())
																.feedingType(trip.getFeedingType())
																.build();
				}

				@EventListener
				public String durationTripTime() {
								int i = 0;
								do {


//												pod chmurką jest puste miejsce

												i++;
												LocalDate returnDate = LocalDate.parse(("SELECT departure_date FROM travel_agency.trip where id_trip = " + i + ";"));
												LocalDate departureDate = LocalDate.parse(("SELECT return_date FROM travel_agency.trip where id_trip = " + i + ";"));
												durationTime = Math.abs(Period.between(returnDate, departureDate).getDays());
												System.out.println(durationTime);
												return ("UPDATE `travel_agency`.`trip` SET `duration_time` = " + durationTime + "where id_trip =" + i + ";");
								} while (i == 10);
				}
}