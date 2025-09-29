package ar.edu.unju.fi.repository;
import ar.edu.unju.fi.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
public interface ClientRepository extends JpaRepository<Client,Long> {
    //SQL SENTENCES BY JPA
    Optional<Client>findById(Long id);
    Optional<Client> findByEmail(String email);
    Optional<Client> findByUsername(String username);
    List<Client> findByNameContainingIgnoreCase(String name);

}
