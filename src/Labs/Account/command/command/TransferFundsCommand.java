package Labs.Account.command.command;

import L5_CommandPattern.command.Command;
import Labs.Account.AccountService;

public class TransferFundsCommand implements Command {
    private AccountService accountService;

    private String fromAccountNumber;
    private String toAccountNumber;
    private double amount;

    private String description;

    public TransferFundsCommand(AccountService accountService, String fromAccountNumber, String toAccountNumber, double amount, String description) {
        this.accountService = accountService;
        this.fromAccountNumber = fromAccountNumber;
        this.toAccountNumber = toAccountNumber;
        this.amount = amount;
        this.description = description;
    }

    @Override
    public void execute() {
        accountService.transferFunds(fromAccountNumber, toAccountNumber, amount, description);
    }

    @Override
    public void undo() {
        //reverse the transfer
        accountService.transferFunds(toAccountNumber, fromAccountNumber, amount, STR."Undo: \{description}");
    }
}
