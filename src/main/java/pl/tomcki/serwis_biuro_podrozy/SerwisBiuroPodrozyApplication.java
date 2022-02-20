package pl.tomcki.serwis_biuro_podrozy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.EventListener;
import pl.tomcki.serwis_biuro_podrozy.model.Trip;
import pl.tomcki.serwis_biuro_podrozy.enums.TripType;
import pl.tomcki.serwis_biuro_podrozy.model.User;

import java.time.LocalDate;

@SpringBootApplication
public class SerwisBiuroPodrozyApplication {

				public static void main(String[] args) {
								SpringApplication.run(SerwisBiuroPodrozyApplication.class, args);
				}

//				@EventListener
//				public void newObjects() {
//
//								User user = new User(1L, "Mateusz", "Kowalski", "Warszawa", "Puławska", 15, 661111111, "tomek@wp.pl");
//								User user1 = new User(2L, "Tomasz", "Nowak", "Kielce", "Warszawska", 98, 661222222, "mateusz@wp.pl");
////								User user2 = new User(3L, "Paweł", "Nowak", "Starachowice", "Kielecka", 17, 661333333, "pawel@wp.pl");
////								User user4 = new User(4L, "Małgorzata", "Parzych", "Szczecin", "Morska", 27, 661444444, "malgosia@wp.pl");
////								User user5 = new User(5L, "Artur", "Mirek", "Ostrowiec Świętokrzyski", "Iłżecka", 21, 661555555, "artur@wp.pl");
////								User user6 = new User(6L, "Paweł", "Banaszek", "Gdynia", "Odyseusza", 2, 661666666, "pawel@wp.pl");
////								User user7 = new User(7L, "Katarzyna", "Bas", "Suwałki", "Radziecka", 29, 661777777, "katarzyna@wp.pl");
////								User user8 = new User(8L, "Anna", "Dazińska", "Wrocław", "Sląska", 74, 661888888, "anna@wp.pl");
////								User user9 = new User(9L, "Kate", "Colley", "Amsterdam", "ForeinStrasse", 74, 661999999, "kate@wp.pl");
////								User user10 = new User(10L, "Arleta", "Żabicka", "Lublin", "Chełmska", 64, 661000000, "arleta@wp.pl");
//
//								Trip trip = new Trip(1L, TripType.ZAMIEJSCOWA, LocalDate.of(2022, 03, 22), LocalDate.of(2022, 03, 29), 800, 650, "BB", "Berlin", "Kraków", )
//								Trip trip2 = new Trip(2L, TripType.ZAMIEJSCOWA, LocalDate.of(2022, 04, 05), LocalDate.of(2022, 04, 14), 1800, 1650, "HB", "Bruksela", "Kraków", )
//								Trip trip3 = new Trip(3L, TripType.OBJAZDOWA, LocalDate.of(2022, 04, 05), LocalDate.of(2022, 04, 12), 1600, 1450, "BB", "Szczecin", "", )
//				}
}
