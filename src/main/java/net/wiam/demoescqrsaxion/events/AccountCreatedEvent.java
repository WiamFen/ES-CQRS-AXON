package net.wiam.demoescqrsaxion.events;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.wiam.demoescqrsaxion.enums.AccountStatus;

@Getter @AllArgsConstructor
public class AccountCreatedEvent {
    private String accountId;
    private double initialBalance;
    private AccountStatus status;
    private String currency;
}
