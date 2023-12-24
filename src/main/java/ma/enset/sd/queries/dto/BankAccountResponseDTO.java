package ma.enset.sd.queries.dto;

import ma.enset.sd.enums.AccountStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

@Data @AllArgsConstructor @NoArgsConstructor
public class BankAccountResponseDTO {
    private String id;
    private BigDecimal balance;
    private AccountStatus status;
}
