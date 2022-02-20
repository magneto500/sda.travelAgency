package pl.tomcki.serwis_biuro_podrozy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.tomcki.serwis_biuro_podrozy.model.User;

public interface UserAppRepository extends JpaRepository<User, Long> {
}