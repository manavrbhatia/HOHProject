package org.hoh.api.domain.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "table_owner")
@Entity
public class TableOwner implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "owner_id", insertable = false, nullable = false)
  private Long ownerId;

  @Column(name = "user_id", nullable = false)
  private Long userId;

  @Column(name = "owner_name", nullable = false)
  private String ownerName;

  @Column(name = "owner_phone")
  private Integer ownerPhone;

  @Column(name = "owner_email")
  private String ownerEmail;

  public Long getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(Long ownerId) {
    this.ownerId = ownerId;
  }

  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public String getOwnerName() {
    return ownerName;
  }

  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }

  public Integer getOwnerPhone() {
    return ownerPhone;
  }

  public void setOwnerPhone(Integer ownerPhone) {
    this.ownerPhone = ownerPhone;
  }

  public String getOwnerEmail() {
    return ownerEmail;
  }

  public void setOwnerEmail(String ownerEmail) {
    this.ownerEmail = ownerEmail;
  }

  public String toString() {
    return "TableOwner{ownerId=" + ownerId + 
      ", userId=" + userId + 
      ", ownerName=" + ownerName + 
      ", ownerPhone=" + ownerPhone + 
      ", ownerEmail=" + ownerEmail + 
      "}";
  }
}