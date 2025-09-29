package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.domain.BankAccount;
import ar.edu.unju.fi.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BankAccountRepository extends JpaRepository<BankAccount,Long> {
    Optional<BankAccount> FindById(Long id);
    Optional <BankAccount> FIndByClient(Client client);
}
