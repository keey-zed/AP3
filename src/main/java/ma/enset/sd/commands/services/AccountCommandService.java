package ma.enset.sd.commands.services;

import ma.enset.sd.commands.dto.CreateAccountRequestDTO;
import ma.enset.sd.commands.dto.CreditAccountRequestDTO;
import ma.enset.sd.commands.dto.DebitAccountRequestDTO;
import java.util.concurrent.CompletableFuture;

public interface AccountCommandService {
    CompletableFuture<String> createAccount(CreateAccountRequestDTO accountRequestDTO);
    CompletableFuture<String> debitAccount(DebitAccountRequestDTO debitAccountRequestDTO);
    CompletableFuture<String> creditAccount(CreditAccountRequestDTO creditAccountRequestDTO);
}
