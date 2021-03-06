package server.model;

import java.math.BigDecimal;

public class RegisteredUser {
    private String username;
    private BigDecimal balance;

    public String getUsername() {
        return username;
    }

    public void setUsername(final String username) {
        this.username = username;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(final BigDecimal balance) {
        this.balance = balance;
    }
}
