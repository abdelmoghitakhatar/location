package com.app.location.service.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

public class UserDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 8051133884476414164L;

    @JsonIgnore
    private Long id;

    @NotNull
    @Size(min = 2, max = 25)
    private String firstName;

    @NotNull
    @Size(min = 2, max = 25)
    private String lastName;

    @NotNull
    @Email
    @Size(min = 5, max = 254)
    private String email;

    @NotNull
    private String CIN;

    @NotNull
    @Pattern(regexp = "^((\\+)212|0|00212)[5-8](\\d{2}){4}$")
    private String tel;

    @NotNull
    private Boolean confirmation = false;

    @NotNull
    private LocalDate birthDay;

    @NotNull
    @Size(min = 8)
    private String password;

    private String address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCIN() {
        return CIN;
    }

    public void setCIN(String CIN) {
        this.CIN = CIN;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Boolean getConfirmation() {
        return confirmation;
    }

    public void setConfirmation(Boolean confirmation) {
        this.confirmation = confirmation;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
