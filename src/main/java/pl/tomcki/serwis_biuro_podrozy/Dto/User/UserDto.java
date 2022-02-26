package pl.tomcki.serwis_biuro_podrozy.Dto.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import pl.tomcki.serwis_biuro_podrozy.model.User;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
				private Long idUser;
				private String name;
				private String lastname;
				private String city;
				private String street;
				private Integer flatNumber;
				private Integer phoneNumber;
				private String emailAddress;

				public static UserDto mapFromUser(User user) {
								return UserDto.builder()
																.idUser(user.getIdUser())
																.name(user.getName())
																.lastname(user.getLastname())
																.city(user.getCity())
																.street(user.getStreet())
																.flatNumber(user.getFlatNumber())
																.phoneNumber(user.getPhoneNumber())
																.emailAddress(user.getEmailAddress())
																.build();
				}
}
