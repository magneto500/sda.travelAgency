package pl.tomcki.serwis_biuro_podrozy.Dto.Trip;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TripCreateRequestDto {
				private Long idTrip;
				private String descriptionTrip;
				private LocalDate departureDate;
				private LocalDate returnDate;
				private BigDecimal adultPrice;
				private String feedingType;
}