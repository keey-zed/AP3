package ma.enset.sd.mappers;

import ma.enset.sd.queries.dto.AccountOperationResponseDTO;
import ma.enset.sd.queries.dto.BankAccountResponseDTO;
import ma.enset.sd.queries.entities.AccountOperation;
import ma.enset.sd.queries.entities.BankAccount;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BankAccountMapper {
    BankAccountResponseDTO bankAccountToBankAccountDTO(BankAccount bankAccount);
    AccountOperationResponseDTO accountOperationToAccountOperationDTO(AccountOperation accountOperation);
}
