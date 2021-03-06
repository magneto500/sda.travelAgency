package pl.tomcki.serwis_biuro_podrozy.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;




@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TripBuying {

				@Id
				@GeneratedValue(strategy = GenerationType.IDENTITY)
				private Long idTripBuying;
				private BigDecimal price;
				private LocalDate buyingDate;
				private Integer adultTicket;
				private Integer childTicket;
				@ManyToOne
				private User user;
				@ManyToOne
				private Trip trip;
}
