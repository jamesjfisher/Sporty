package com.sporty.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "account_info")
public class AccountInfo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long accountid;
  private String accountname;
  private Long accounttype;
  private String lastname;
  private String firstname;
  private String mi;
  private String addr1;
  private String addr2;
  private String city;
  private String state;
  private String zip;
  private String telnum;
  private String faxnum;
  private String email;
  private String billing_lastname;
  private String billing_firstname;
  private String billing_mi;
  private String billing_addr1;
  private String billing_addr2;
  private String billing_city;
  private String billing_state;
  private String billing_zip;
  private String creditcardnum;
  private Date expirydate;
  private String card_type;
  private Date creationdate;
  private Date lastupdated;
  private String updatedby;
  private String partner;
  private String enableaddinsurance;
  private String enableaddinsfrombilling;
  private String referralnum;
  private String requirescoding;
  private String enableupdatepayment;
  private String localeversion;
  private String secureconnectmailboxid;
  private String secureconnectuserid;
  private String secureconnectpassword;
  private String salesforceid;
  private String oneworldid;
  private String nbid;
  private String mfin1;
  private String mfin2;
  private String mfin3;
  private String clinical;
  private String registration;
  private String billing;
  private String scheduling;
  private String quippe;
  private String rx;
  private String dataexchange;

  @OneToMany(mappedBy = "accountInfo", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  private Set<PulseCloudUser> pulseCloudUser;
  @OneToOne(mappedBy = "accountInfo", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  private AccountStatus accountStatus;

  public AccountStatus getAccountStatus() { return accountStatus; }

  public void setAccountStatus(AccountStatus accountStatus) { this.accountStatus = accountStatus; }

  public Set<PulseCloudUser> getPulseCloudUser() {
    return pulseCloudUser;
  }

  public void setPulseCloudUser(Set<PulseCloudUser> pulseCloudUser) {
    this.pulseCloudUser = pulseCloudUser;
  }

  public Long getAccountid() {
    return accountid;
  }

  public void setAccountid(Long accountid) {
    this.accountid = accountid;
  }

  public String getAccountname() {
    return accountname;
  }

  public void setAccountname(String accountname) {
    this.accountname = accountname;
  }

  public Long getAccounttype() {
    return accounttype;
  }

  public void setAccounttype(Long accounttype) {
    this.accounttype = accounttype;
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

  public String getMi() {
    return mi;
  }

  public void setMi(String mi) {
    this.mi = mi;
  }

  public String getAddr1() {
    return addr1;
  }

  public void setAddr1(String addr1) {
    this.addr1 = addr1;
  }

  public String getAddr2() {
    return addr2;
  }

  public void setAddr2(String addr2) {
    this.addr2 = addr2;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  public String getTelnum() {
    return telnum;
  }

  public void setTelnum(String telnum) {
    this.telnum = telnum;
  }

  public String getFaxnum() {
    return faxnum;
  }

  public void setFaxnum(String faxnum) {
    this.faxnum = faxnum;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getBilling_lastname() {
    return billing_lastname;
  }

  public void setBilling_lastname(String billing_lastname) {
    this.billing_lastname = billing_lastname;
  }

  public String getBilling_firstname() {
    return billing_firstname;
  }

  public void setBilling_firstname(String billing_firstname) {
    this.billing_firstname = billing_firstname;
  }

  public String getBilling_mi() {
    return billing_mi;
  }

  public void setBilling_mi(String billing_mi) {
    this.billing_mi = billing_mi;
  }

  public String getBilling_addr1() {
    return billing_addr1;
  }

  public void setBilling_addr1(String billing_addr1) {
    this.billing_addr1 = billing_addr1;
  }

  public String getBilling_addr2() {
    return billing_addr2;
  }

  public void setBilling_addr2(String billing_addr2) {
    this.billing_addr2 = billing_addr2;
  }

  public String getBilling_city() {
    return billing_city;
  }

  public void setBilling_city(String billing_city) {
    this.billing_city = billing_city;
  }

  public String getBilling_state() {
    return billing_state;
  }

  public void setBilling_state(String billing_state) {
    this.billing_state = billing_state;
  }

  public String getBilling_zip() {
    return billing_zip;
  }

  public void setBilling_zip(String billing_zip) {
    this.billing_zip = billing_zip;
  }

  public String getCreditcardnum() {
    return creditcardnum;
  }

  public void setCreditcardnum(String creditcardnum) {
    this.creditcardnum = creditcardnum;
  }

  public Date getExpirydate() {
    return expirydate;
  }

  public void setExpirydate(Date expirydate) {
    this.expirydate = expirydate;
  }

  public String getCard_type() {
    return card_type;
  }

  public void setCard_type(String card_type) {
    this.card_type = card_type;
  }

  public Date getCreationdate() {
    return creationdate;
  }

  public void setCreationdate(Date creationdate) {
    this.creationdate = creationdate;
  }

  public Date getLastupdated() {
    return lastupdated;
  }

  public void setLastupdated(Date lastupdated) {
    this.lastupdated = lastupdated;
  }

  public String getUpdatedby() {
    return updatedby;
  }

  public void setUpdatedby(String updatedby) {
    this.updatedby = updatedby;
  }

  public String getPartner() {
    return partner;
  }

  public void setPartner(String partner) {
    this.partner = partner;
  }

  public String getEnableaddinsurance() {
    return enableaddinsurance;
  }

  public void setEnableaddinsurance(String enableaddinsurance) {
    this.enableaddinsurance = enableaddinsurance;
  }

  public String getEnableaddinsfrombilling() {
    return enableaddinsfrombilling;
  }

  public void setEnableaddinsfrombilling(String enableaddinsfrombilling) {
    this.enableaddinsfrombilling = enableaddinsfrombilling;
  }

  public String getReferralnum() {
    return referralnum;
  }

  public void setReferralnum(String referralnum) {
    this.referralnum = referralnum;
  }

  public String getRequirescoding() {
    return requirescoding;
  }

  public void setRequirescoding(String requirescoding) {
    this.requirescoding = requirescoding;
  }

  public String getEnableupdatepayment() {
    return enableupdatepayment;
  }

  public void setEnableupdatepayment(String enableupdatepayment) {
    this.enableupdatepayment = enableupdatepayment;
  }

  public String getLocaleversion() {
    return localeversion;
  }

  public void setLocaleversion(String localeversion) {
    this.localeversion = localeversion;
  }

  public String getSecureconnectmailboxid() {
    return secureconnectmailboxid;
  }

  public void setSecureconnectmailboxid(String secureconnectmailboxid) {
    this.secureconnectmailboxid = secureconnectmailboxid;
  }

  public String getSecureconnectuserid() {
    return secureconnectuserid;
  }

  public void setSecureconnectuserid(String secureconnectuserid) {
    this.secureconnectuserid = secureconnectuserid;
  }

  public String getSecureconnectpassword() {
    return secureconnectpassword;
  }

  public void setSecureconnectpassword(String secureconnectpassword) {
    this.secureconnectpassword = secureconnectpassword;
  }

  public String getSalesforceid() {
    return salesforceid;
  }

  public void setSalesforceid(String salesforceid) {
    this.salesforceid = salesforceid;
  }

  public String getOneworldid() {
    return oneworldid;
  }

  public void setOneworldid(String oneworldid) {
    this.oneworldid = oneworldid;
  }

  public String getNbid() {
    return nbid;
  }

  public void setNbid(String nbid) {
    this.nbid = nbid;
  }

  public String getMfin1() {
    return mfin1;
  }

  public void setMfin1(String mfin1) {
    this.mfin1 = mfin1;
  }

  public String getMfin2() {
    return mfin2;
  }

  public void setMfin2(String mfin2) {
    this.mfin2 = mfin2;
  }

  public String getMfin3() {
    return mfin3;
  }

  public void setMfin3(String mfin3) {
    this.mfin3 = mfin3;
  }

  public String getClinical() {
    return clinical;
  }

  public void setClinical(String clinical) {
    this.clinical = clinical;
  }

  public String getRegistration() {
    return registration;
  }

  public void setRegistration(String registration) {
    this.registration = registration;
  }

  public String getBilling() {
    return billing;
  }

  public void setBilling(String billing) {
    this.billing = billing;
  }

  public String getScheduling() {
    return scheduling;
  }

  public void setScheduling(String scheduling) {
    this.scheduling = scheduling;
  }

  public String getQuippe() {
    return quippe;
  }

  public void setQuippe(String quippe) {
    this.quippe = quippe;
  }

  public String getRx() {
    return rx;
  }

  public void setRx(String rx) {
    this.rx = rx;
  }

  public String getDataexchange() {
    return dataexchange;
  }

  public void setDataexchange(String dataexchange) {
    this.dataexchange = dataexchange;
  }
}
