package org.hoh.api.domain.entities;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "donation")
public class Donation implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "donation_id", insertable = false, nullable = false)
  private Long donationId;

  @Column(name = "guest_id", nullable = false)
  private Long guestId;

  @Column(name = "donation_amount")
  private Long donationAmount;

  @Column(name = "payment_method_id", nullable = false)
  private Long paymentMethodId;

  @Column(name = "payment_info")
  private String paymentInfo;

  @Column(name = "is_company_matching")
  private Boolean companyMatching = Boolean.FALSE;

  @Column(name = "company_info")
  private String companyInfo;

  @Column(name = "created_on", nullable = false)
  private Timestamp createdOn;

  @Column(name = "modified_on", nullable = false)
  private Timestamp modifiedOn;

  @Column(name = "updated_by", nullable = false)
  private Long updatedBy;

  @Column(name = "comments")
  private String comments;

  public Long getDonationId() {
    return donationId;
  }

  public void setDonationId(Long donationId) {
    this.donationId = donationId;
  }

  public Long getGuestId() {
    return guestId;
  }

  public void setGuestId(Long guestId) {
    this.guestId = guestId;
  }

  public Long getDonationAmount() {
    return donationAmount;
  }

  public void setDonationAmount(Long donationAmount) {
    this.donationAmount = donationAmount;
  }

  public Long getPaymentMethodId() {
    return paymentMethodId;
  }

  public void setPaymentMethodId(Long paymentMethodId) {
    this.paymentMethodId = paymentMethodId;
  }

  public String getPaymentInfo() {
    return paymentInfo;
  }

  public void setPaymentInfo(String paymentInfo) {
    this.paymentInfo = paymentInfo;
  }

  public Boolean isCompanyMatching() {
    return companyMatching;
  }

  public void setCompanyMatching(Boolean companyMatching) {
    this.companyMatching = companyMatching;
  }

  public String getCompanyInfo() {
    return companyInfo;
  }

  public void setCompanyInfo(String companyInfo) {
    this.companyInfo = companyInfo;
  }

  public Timestamp getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(Timestamp createdOn) {
    this.createdOn = createdOn;
  }

  public Timestamp getModifiedOn() {
    return modifiedOn;
  }

  public void setModifiedOn(Timestamp modifiedOn) {
    this.modifiedOn = modifiedOn;
  }

  public Long getUpdatedBy() {
    return updatedBy;
  }

  public void setUpdatedBy(Long updatedBy) {
    this.updatedBy = updatedBy;
  }

  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public String toString() {
    return "Donation{donationId=" + donationId + 
      ", guestId=" + guestId + 
      ", donationAmount=" + donationAmount + 
      ", paymentMethodId=" + paymentMethodId + 
      ", paymentInfo=" + paymentInfo + 
      ", companyMatching=" + companyMatching + 
      ", companyInfo=" + companyInfo + 
      ", createdOn=" + createdOn + 
      ", modifiedOn=" + modifiedOn + 
      ", updatedBy=" + updatedBy + 
      ", comments=" + comments + 
      "}";
  }
}