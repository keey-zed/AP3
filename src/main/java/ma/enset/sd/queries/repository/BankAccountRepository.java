package ma.enset.sd.queries.repository;

import ma.enset.sd.queries.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}
