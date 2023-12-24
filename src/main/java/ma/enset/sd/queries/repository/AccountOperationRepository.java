package ma.enset.sd.queries.repository;

import ma.enset.sd.queries.entities.AccountOperation;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AccountOperationRepository extends JpaRepository<AccountOperation,Long> {
    List<AccountOperation> findByBankAccountId(String accountId);
}
