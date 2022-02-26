package pl.tomcki.serwis_biuro_podrozy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.tomcki.serwis_biuro_podrozy.Dto.User.UserCreateRequest;
import pl.tomcki.serwis_biuro_podrozy.Dto.User.UserDto;
import pl.tomcki.serwis_biuro_podrozy.model.User;
import pl.tomcki.serwis_biuro_podrozy.repository.UserRepository;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {

				public final UserRepository userRepository;

				@Autowired
				public UserService(UserRepository userRepository) {
								this.userRepository = userRepository;
				}


				public List<UserDto> showAllUsers() {
								return userRepository.findAll().stream()
																.map(UserDto::mapFromUser)
																.collect(Collectors.toList());
				}

				public void deleteById(Long idUser) {
								userRepository.deleteById(idUser);
				}

				public void saveItem(UserCreateRequest request) {
								User createdUser = User.builder()

																.name(request.getName())
																.lastname(request.getLastname())
																.city(request.getCity())
																.street(request.getStreet())
																.flatNumber(request.getFlatNumber())
																.phoneNumber(request.getPhoneNumber())
																.emailAddress(request.getEmailAddress())
																.build();

								userRepository.save(createdUser);
				}

				public UserDto findById(Long idUser) {
								Optional<User> userOptional = userRepository.findById(idUser);
								if (userOptional.isPresent()) {
												User user = userOptional.get();
												return UserDto.mapFromUser(user);
								}
								throw new EntityNotFoundException("Didn't find user with id: " + idUser);
				}


				public void updateItem(Long idUser, UserCreateRequest request) {
								Optional<User> userOptional = userRepository.findById(idUser);
								if (userOptional.isPresent()) {
												User user = userOptional.get();

												user.setName(request.getName());
												user.setLastname(request.getLastname());
												user.setCity(request.getCity());
												user.setStreet(request.getStreet());
												user.setFlatNumber(request.getFlatNumber());
												user.setPhoneNumber(request.getPhoneNumber());
												user.setEmailAddress(request.getEmailAddress());

												userRepository.save(user);

								}
								throw new EntityNotFoundException("Didn't find city with id: " + idUser);
				}
}

