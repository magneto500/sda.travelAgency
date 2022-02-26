package pl.tomcki.serwis_biuro_podrozy.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

				@Id
				@GeneratedValue(strategy = GenerationType.IDENTITY)
				private Long idUser;
				private String name;
				private String lastname;
				private String city;
				private String street;
				private Integer flatNumber;
				private Integer phoneNumber;
				private String emailAddress;
				@OneToMany(mappedBy = "user")
				private Set<TripBuying> tripBuying;

				public User(Long idUser, String name, String lastname, String city, String street, Integer flatNumber, Integer phoneNumber, String emailAddress) {
								this.idUser = idUser;
								this.name = name;
								this.lastname = lastname;
								this.city = city;
								this.street = street;
								this.flatNumber = flatNumber;
								this.phoneNumber = phoneNumber;
								this.emailAddress = emailAddress;
				}
}
