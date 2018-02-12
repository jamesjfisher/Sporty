package com.sporty.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "acc_status")
public class AccountStatus {

  @Id
  private Long accountid;
  private Long status;
  private String updatedby;
  private Date lastupdated;

  @OneToOne(fetch = FetchType.LAZY)
  @PrimaryKeyJoinColumn
  private AccountInfo accountInfo;

  public AccountInfo getAccountInfo() {
    return accountInfo;
  }

  public void setAccountInfo(AccountInfo accountInfo) {
    this.accountInfo = accountInfo;
  }

  public Long getAccountid() {
    return accountid;
  }

  public void setAccountid(Long accountid) {
    this.accountid = accountid;
  }

  public Long getStatus() {
    return status;
  }

  public void setStatus(Long status) {
    this.status = status;
  }

  public String getUpdatedby() {
    return updatedby;
  }

  public void setUpdatedby(String updatedby) {
    this.updatedby = updatedby;
  }

  public Date getLastupdated() {
    return lastupdated;
  }

  public void setLastupdated(Date lastupdated) {
    this.lastupdated = lastupdated;
  }
}
