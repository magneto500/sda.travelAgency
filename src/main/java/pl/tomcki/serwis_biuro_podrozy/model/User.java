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
public class User {

				@Id
				@GeneratedValue(strategy = GenerationType.AUTO)
				private Long idUser;
				private String name;
				private String lastname;
				private String city;
				private String street;
				private Integer phoneNumber;
				private String emailAddress;
				@OneToMany(mappedBy = "user")
				private Set<TripBuying> tripBuying;

}
