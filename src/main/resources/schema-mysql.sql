# Wybór bazy danych
use `travel_agency`;

# Wstawianie inicjalnych miast do bazy
;
INSERT IGNORE INTO `travel_agency`.`city` (`id_city`,`city_name`,`country`)VALUES(1, 'Gdansk','Polska');
INSERT IGNORE INTO `travel_agency`.`city` (`id_city`,`city_name`,`country`)VALUES(2, 'Warszawa','Polska');
INSERT IGNORE INTO `travel_agency`.`city` (`id_city`,`city_name`,`country`)VALUES(3, 'Poznań','Polska');
INSERT IGNORE INTO `travel_agency`.`city` (`id_city`,`city_name`,`country`)VALUES(4, 'Berlin','Niemcy');
INSERT IGNORE INTO `travel_agency`.`city` (`id_city`,`city_name`,`country`)VALUES(5, 'Hamburg','Niemcy');
INSERT IGNORE INTO `travel_agency`.`city` (`id_city`,`city_name`,`country`)VALUES(6, 'Madryt','Hiszpania');
INSERT IGNORE INTO `travel_agency`.`city` (`id_city`,`city_name`,`country`)VALUES(7, 'Paryż','Francja');
INSERT IGNORE INTO `travel_agency`.`city` (`id_city`,`city_name`,`country`)VALUES(8, 'Praga','Czechy');
INSERT IGNORE INTO `travel_agency`.`city` (`id_city`,`city_name`,`country`)VALUES(9, 'Moskwa','Rosja');





# Wstawianie inicjalnych użytkowników
;
INSERT IGNORE INTO `travel_agency`.`user`(`id_user`,`city`,`email_address`,`flat_number`,`lastname`,`name`,`phone_number`,`street`)VALUES(1,"Warszawa","mateusz@wp.pl",30,"Kowalski","Mateusz",661111111,"Puławska");
INSERT IGNORE INTO `travel_agency`.`user`(`id_user`,`city`,`email_address`,`flat_number`,`lastname`,`name`,`phone_number`,`street`)VALUES(2,"Warszawa","kasia@wp.pl",15,"Nowak","Katarzyna",661222222,"Grodkowska");

# Wstawianie inicjalnych wycieczek
;
INSERT IGNORE INTO `travel_agency`.`trip`(`id_trip`,`adult_price`,`departure_date`,`description_trip`,`duration_time`,`feeding_type`,`return_date`,`from_city_id_city`,`to_city_id_city`)VALUES(1,1200,'2022-03-03','zamiejscowa',null,'BB','2022-04-04',1,6);
INSERT IGNORE INTO `travel_agency`.`trip`(`id_trip`,`adult_price`,`departure_date`,`description_trip`,`duration_time`,`feeding_type`,`return_date`,`from_city_id_city`,`to_city_id_city`)VALUES(2,1400,'2022-03-02','objazdowa',null,'BB','2022-03-14',4,2);
INSERT IGNORE INTO `travel_agency`.`trip`(`id_trip`,`adult_price`,`departure_date`,`description_trip`,`duration_time`,`feeding_type`,`return_date`,`from_city_id_city`,`to_city_id_city`)VALUES(3,2400,'2022-03-08','objazdowa',null,'HB','2022-03-22',4,1);
INSERT IGNORE INTO `travel_agency`.`trip`(`id_trip`,`adult_price`,`departure_date`,`description_trip`,`duration_time`,`feeding_type`,`return_date`,`from_city_id_city`,`to_city_id_city`)VALUES(4,2000,'2022-03-24','zamiejscowa',null,'FB','2022-04-06',2,3);
INSERT IGNORE INTO `travel_agency`.`trip`(`id_trip`,`adult_price`,`departure_date`,`description_trip`,`duration_time`,`feeding_type`,`return_date`,`from_city_id_city`,`to_city_id_city`)VALUES(5,2800,'2022-04-24','objazdowa',null,'FB','2022-04-06',2,4);
INSERT IGNORE INTO `travel_agency`.`trip`(`id_trip`,`adult_price`,`departure_date`,`description_trip`,`duration_time`,`feeding_type`,`return_date`,`from_city_id_city`,`to_city_id_city`)VALUES(6,3300,'2022-05-24','zamiejscowa',null,'FB','2022-06-06',3,4);
INSERT IGNORE INTO `travel_agency`.`trip`(`id_trip`,`adult_price`,`departure_date`,`description_trip`,`duration_time`,`feeding_type`,`return_date`,`from_city_id_city`,`to_city_id_city`)VALUES(7,2450,'2022-02-24','objazdowa',null,'FB','2022-03-06',3,1);
INSERT IGNORE INTO `travel_agency`.`trip`(`id_trip`,`adult_price`,`departure_date`,`description_trip`,`duration_time`,`feeding_type`,`return_date`,`from_city_id_city`,`to_city_id_city`)VALUES(8,1850,'2022-03-21','objazdowa',null,'HB','2022-03-08',3,5);
INSERT IGNORE INTO `travel_agency`.`trip`(`id_trip`,`adult_price`,`departure_date`,`description_trip`,`duration_time`,`feeding_type`,`return_date`,`from_city_id_city`,`to_city_id_city`)VALUES(9,1050,'2022-06-10','zamiejscowa',null,'FB','2022-06-17',3,4);
INSERT IGNORE INTO `travel_agency`.`trip`(`id_trip`,`adult_price`,`departure_date`,`description_trip`,`duration_time`,`feeding_type`,`return_date`,`from_city_id_city`,`to_city_id_city`)VALUES(10,450,'2022-04-10','zamiejscowa',null,'BB','2022-04-14',8,4);
