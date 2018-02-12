package com.sporty.domain;

import org.hibernate.annotations.Formula;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "phy_password")
public class PulseCloudUser {

  @EmbeddedId
  private PulseCloudUserId id;
  private String ipaddress;
  private Timestamp created;
  private String createdby;
  private Timestamp lastupdated;
  private String updatedby;
  private String userid;
  private String password;
  private String passwordhint;
  private Long usergroup;
  private String credentials;
  private Long externalemr;
  private String active;
  private Long provid;
  private String lastname;
  private String firstname;
  private String lockout;
  private String allowaccess;
  private Long clinicalprovid;
  private Date startdate;
  private Date enddate;
  private Timestamp lastpasswordupdated;
  private String needsresetpassword;
  private String passwordhintanswer;
  private String restrictipaddress;
  @Formula(value="f_accountid(accountid::int)")
  private String accountCode;

  public String getAccountCode() { return accountCode; }

  public void setAccountCode(String accountCode) { this.accountCode = accountCode; }

  @ManyToOne
  @JoinColumn(name = "accountid", insertable=false, updatable=false)
  private AccountInfo accountInfo;

  public AccountInfo getAccountInfo() {
      return accountInfo;
  }

  public void setAccountInfo(AccountInfo accountInfo) {
      this.accountInfo = accountInfo;
  }

  public PulseCloudUserId getId() { return id; }

  public void setId(PulseCloudUserId id) { this.id = id; }

  public String getIpaddress() {
    return ipaddress;
  }

  public void setIpaddress(String ipaddress) {
    this.ipaddress = ipaddress;
  }

  public Timestamp getCreated() {
    return created;
  }

  public void setCreated(Timestamp created) {
    this.created = created;
  }

  public String getCreatedby() {
    return createdby;
  }

  public void setCreatedby(String createdby) {
    this.createdby = createdby;
  }

  public Timestamp getLastupdated() {
    return lastupdated;
  }

  public void setLastupdated(Timestamp lastupdated) {
    this.lastupdated = lastupdated;
  }

  public String getUpdatedby() {
    return updatedby;
  }

  public void setUpdatedby(String updatedby) {
    this.updatedby = updatedby;
  }

  public String getUserid() {
    return userid;
  }

  public void setUserid(String userid) {
    this.userid = userid;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getPasswordhint() {
    return passwordhint;
  }

  public void setPasswordhint(String passwordhint) {
    this.passwordhint = passwordhint;
  }

  public Long getUsergroup() {
    return usergroup;
  }

  public void setUsergroup(Long usergroup) {
    this.usergroup = usergroup;
  }

  public String getCredentials() {
    return credentials;
  }

  public void setCredentials(String credentials) {
    this.credentials = credentials;
  }

  public Long getExternalemr() {
    return externalemr;
  }

  public void setExternalemr(Long externalemr) {
    this.externalemr = externalemr;
  }

  public String getActive() {
    return active;
  }

  public void setActive(String active) {
    this.active = active;
  }

  public Long getProvid() {
    return provid;
  }

  public void setProvid(Long provid) {
    this.provid = provid;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getLockout() {
    return lockout;
  }

  public void setLockout(String lockout) {
    this.lockout = lockout;
  }

  public String getAllowaccess() {
    return allowaccess;
  }

  public void setAllowaccess(String allowaccess) {
    this.allowaccess = allowaccess;
  }

  public Long getClinicalprovid() {
    return clinicalprovid;
  }

  public void setClinicalprovid(Long clinicalprovid) {
    this.clinicalprovid = clinicalprovid;
  }

  public Date getStartdate() {
    return startdate;
  }

  public void setStartdate(Date startdate) {
    this.startdate = startdate;
  }

  public Date getEnddate() {
    return enddate;
  }

  public void setEnddate(Date enddate) {
    this.enddate = enddate;
  }

  public Timestamp getLastpasswordupdated() {
    return lastpasswordupdated;
  }

  public void setLastpasswordupdated(Timestamp lastpasswordupdated) {
    this.lastpasswordupdated = lastpasswordupdated;
  }

  public String getNeedsresetpassword() {
    return needsresetpassword;
  }

  public void setNeedsresetpassword(String needsresetpassword) {
    this.needsresetpassword = needsresetpassword;
  }

  public String getPasswordhintanswer() {
    return passwordhintanswer;
  }

  public void setPasswordhintanswer(String passwordhintanswer) {
    this.passwordhintanswer = passwordhintanswer;
  }

  public String getRestrictipaddress() {
    return restrictipaddress;
  }

  public void setRestrictipaddress(String restrictipaddress) {
    this.restrictipaddress = restrictipaddress;
  }
}

