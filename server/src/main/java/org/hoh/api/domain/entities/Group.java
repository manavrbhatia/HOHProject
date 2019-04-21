package org.hoh.api.domain.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "group")
public class Group implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "table_id", insertable = false, nullable = false)
  private Long tableId;

  @Column(name = "table_number", nullable = false)
  private Long tableNumber;

  @Column(name = "table_owner_id", nullable = false)
  private Long tableOwnerId;

  @Column(name = "max_capacity", nullable = false)
  private Long maxCapacity;

  @Column(name = "is_premium", nullable = false)
  private Boolean premium = Boolean.FALSE;

  @Column(name = "comments")
  private String comments;

  public Long getTableId() {
    return tableId;
  }

  public void setTableId(Long tableId) {
    this.tableId = tableId;
  }

  public Long getTableNumber() {
    return tableNumber;
  }

  public void setTableNumber(Long tableNumber) {
    this.tableNumber = tableNumber;
  }

  public Long getTableOwnerId() {
    return tableOwnerId;
  }

  public void setTableOwnerId(Long tableOwnerId) {
    this.tableOwnerId = tableOwnerId;
  }

  public Long getMaxCapacity() {
    return maxCapacity;
  }

  public void setMaxCapacity(Long maxCapacity) {
    this.maxCapacity = maxCapacity;
  }

  public Boolean isPremium() {
    return premium;
  }

  public void setPremium(Boolean premium) {
    this.premium = premium;
  }

  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public String toString() {
    return "Group{tableId=" + tableId + 
      ", tableNumber=" + tableNumber + 
      ", tableOwnerId=" + tableOwnerId + 
      ", maxCapacity=" + maxCapacity + 
      ", premium=" + premium + 
      ", comments=" + comments + 
      "}";
  }
}