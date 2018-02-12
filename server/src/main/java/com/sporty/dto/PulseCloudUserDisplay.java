package com.sporty.dto;

public class PulseCloudUserDisplay {

    public PulseCloudUserDisplay() {}

    private String accountId;
    private String userId;
    private String firstName;
    private String lastName;
    private String active;

    public String getAccountId() { return accountId; }

    public void setAccountId(String accountId) { this.accountId = accountId; }

    public String getUserId() { return userId; }

    public void setUserId(String userId) { this.userId = userId; }

    public String getFirstName() { return firstName; }

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getActive() { return active; }

    public void setActive(String active) { this.active = active; }
}
