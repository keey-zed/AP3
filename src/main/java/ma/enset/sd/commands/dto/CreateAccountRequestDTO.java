package ma.enset.sd.commands.dto;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class CreateAccountRequestDTO {
    private BigDecimal balance;
    private String currency;
}
