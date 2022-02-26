package pl.tomcki.serwis_biuro_podrozy.Dto.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserCreateRequest {
				private Long idUser;
				private String name;
				private String lastname;
				private String city;
				private String street;
				private Integer flatNumber;
				private Integer phoneNumber;
				private String emailAddress;
}
