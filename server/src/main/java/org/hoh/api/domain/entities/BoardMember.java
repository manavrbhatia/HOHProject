package org.hoh.api.domain.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "board_member")
@Entity
public class BoardMember implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(insertable = false, name = "board_member_id", nullable = false)
  private Long boardMemberId;

  @Column(name = "owner_id", nullable = false)
  private Long ownerId;

  @Column(name = "user_id", nullable = false)
  private Long userId;

  @Column(name = "member_name", nullable = false)
  private String memberName;

  public Long getBoardMemberId() {
    return boardMemberId;
  }

  public void setBoardMemberId(Long boardMemberId) {
    this.boardMemberId = boardMemberId;
  }

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

  public String getMemberName() {
    return memberName;
  }

  public void setMemberName(String memberName) {
    this.memberName = memberName;
  }

  public String toString() {
    return "BoardMember{boardMemberId=" + boardMemberId + 
      ", ownerId=" + ownerId + 
      ", userId=" + userId + 
      ", memberName=" + memberName + 
      "}";
  }
}