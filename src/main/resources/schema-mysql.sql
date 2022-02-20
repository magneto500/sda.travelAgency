# Wybór bazy danych
use `travel_agency`;

# Wstawianie inicjalnych miast do bazy
INSERT IGNORE INTO `travel_agency`.`city` (`id_city`,`city_name`,`country`)VALUES(1, 'Gdansk','Polska');
INSERT IGNORE INTO `travel_agency`.`city` (`id_city`,`city_name`,`country`)VALUES(2, 'Warszawa','Polska');
INSERT IGNORE INTO `travel_agency`.`city` (`id_city`,`city_name`,`country`)VALUES(3, 'Poznań','Polska');
INSERT IGNORE INTO `travel_agency`.`city` (`id_city`,`city_name`,`country`)VALUES(4, 'Berlin','Niemcy');
INSERT IGNORE INTO `travel_agency`.`city` (`id_city`,`city_name`,`country`)VALUES(5, 'Hamburg','Niemcy');
INSERT IGNORE INTO `travel_agency`.`city` (`id_city`,`city_name`,`country`)VALUES(6, 'Madryt','Hiszpania');
INSERT IGNORE INTO `travel_agency`.`city` (`id_city`,`city_name`,`country`)VALUES(7, 'Paryż','Francja');

# Wstawianie inicjalnych użytkowników
INSERT IGNORE INTO `travel_agency`.`user`(`id_user`,`city`,`email_address`,`flat_number`,`lastname`,`name`,`phone_number`,`street`)VALUES(1,"Warszawa","tomek@wp.pl",30,"Kowalski","Mateusz",661111111,"Puławska");

# Wstawianie inicjalnych wycieczek
INSERT IGNORE INTO `travel_agency`.`trip`(`idtrip`,`adult_price`,`child_price`,`departure_date`,`description_trip`,`feeding_type`,`return_date`,`from_city_id_city`,`to_city_id_city`)VALUES(1,1200,100,'2022-03-03','Wycieczka 1','BB','2022-04-04',1,6);
