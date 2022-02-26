package pl.tomcki.serwis_biuro_podrozy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.tomcki.serwis_biuro_podrozy.Dto.User.UserCreateRequest;
import pl.tomcki.serwis_biuro_podrozy.Dto.User.UserDto;
import pl.tomcki.serwis_biuro_podrozy.service.UserService;

import java.util.List;

//http://localhost:8080/trip/show
@RestController
@RequestMapping("/user")
public class UserController {


				public final UserService userService;
				@Autowired
				public UserController(UserService userService) {
								this.userService = userService;
				}


				@GetMapping("/show")
				public List<UserDto> showUsers() {
								return userService.showAllUsers();
				}

				@PostMapping("/add")
				public void saveUser(@RequestBody UserCreateRequest request) {
								userService.saveItem(request);
				}

				@PostMapping("/update/{id}")
				public void saveModifiedUser(@PathVariable(name = "id") Long idUser, @RequestBody UserCreateRequest request) {
								userService.updateItem(idUser, request);
				}

				@DeleteMapping("/delete/{id}")
				public void deleteById(@PathVariable(name = "id") Long idUser) {
								userService.deleteById(idUser);
				}

				@GetMapping("/show/{id}")
				public UserDto findById(@PathVariable(name = "id") Long idUser) {
								return userService.findById(idUser);
				}


}


