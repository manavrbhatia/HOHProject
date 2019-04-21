package org.hoh.api.domain.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "guest")
public class Guest implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "guest_id", insertable = false, nullable = false)
  private Long guestId;

  @Column(name = "guest_name", nullable = false)
  private String guestName = "Guest";

  @Column(name = "guest_phone")
  private String guestPhone = "Guest";

  @Column(name = "guest_email")
  private String guestEmail;

  @Column(name = "is_sponsor", nullable = false)
  private Boolean sponsor = Boolean.FALSE;

  @Column(name = "table_id", nullable = false)
  private Long tableId;

  @Column(name = "user_type_id", nullable = false)
  private Long userTypeId;

  public Long getGuestId() {
    return guestId;
  }

  public void setGuestId(Long guestId) {
    this.guestId = guestId;
  }

  public String getGuestName() {
    return guestName;
  }

  public void setGuestName(String guestName) {
    this.guestName = guestName;
  }

  public String getGuestPhone() {
    return guestPhone;
  }

  public void setGuestPhone(String guestPhone) {
    this.guestPhone = guestPhone;
  }

  public String getGuestEmail() {
    return guestEmail;
  }

  public void setGuestEmail(String guestEmail) {
    this.guestEmail = guestEmail;
  }

  public Boolean isSponsor() {
    return sponsor;
  }

  public void setSponsor(Boolean sponsor) {
    this.sponsor = sponsor;
  }

  public Long getTableId() {
    return tableId;
  }

  public void setTableId(Long tableId) {
    this.tableId = tableId;
  }

  public Long getUserTypeId() {
    return userTypeId;
  }

  public void setUserTypeId(Long userTypeId) {
    this.userTypeId = userTypeId;
  }

  public String toString() {
    return "Guest{guestId=" + guestId + 
      ", guestName=" + guestName + 
      ", guestPhone=" + guestPhone + 
      ", guestEmail=" + guestEmail + 
      ", sponsor=" + sponsor + 
      ", tableId=" + tableId + 
      ", userTypeId=" + userTypeId + 
      "}";
  }
}