package pl.tomcki.serwis_biuro_podrozy.Dto.Trip;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;



@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TripSearchDto {
				private String tripDescription;
				private LocalDate dateStartFrom;
				private LocalDate dateStartTo;
				private Integer priceFrom;
				private Integer priceTo;
				private String cityStart;
}
