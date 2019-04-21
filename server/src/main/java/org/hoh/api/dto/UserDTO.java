package org.hoh.api.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

public class UserDTO {
    @JsonInclude(value = JsonInclude.Include.NON_NULL)
    private Long userID;
    private String username;
    private String password;
    private String firstname;

    private String lastname;
    private String userEmail;
    private String userPhone;
    private Long userTypeID;

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public Long getUserTypeID() {
        return userTypeID;
    }

    public void setUserTypeID(Long userTypeID) {
        this.userTypeID = userTypeID;
    }
}
