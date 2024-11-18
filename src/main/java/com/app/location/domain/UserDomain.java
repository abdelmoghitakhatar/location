package com.app.location.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "user")
public class UserDomain implements Serializable {

    @Serial
    private static final long serialVersionUID = -6100591526098454505L;

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 2, max = 25)
    @Column(nullable = false)
    private String firstName;

    @NotNull
    @Size(min = 2, max = 25)
    @Column(nullable = false)
    private String lastName;

    @NotNull
    @Email
    @Size(min = 5, max = 254)
    @Column(nullable = false, unique = true)
    private String email;

    @NotNull
    @Column(nullable = false, unique = true)
    private String CIN;

    @NotNull
    @Pattern(regexp = "^((\\+)212|0|00212)[5-8](\\d{2}){4}$")
    @Column(nullable = false, unique = true)
    private String tel;

    @NotNull
    @Column(nullable = false)
    private boolean confirmed = false;

    @NotNull
    @Column(nullable = false)
    private LocalDate birthDay;

    @NotNull
    @Size(min = 8)
    @Column(nullable = false)
    private String password;

    private String address;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "user", fetch = FetchType.LAZY)
    private Set<HouseDomain> houses = new HashSet<>() ;

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

    public boolean isConfirmed() {
        return confirmed;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
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

    public Set<HouseDomain> getHouses() {
        return houses;
    }

    public void setHouses(Set<HouseDomain> houses) {
        if (houses != null) {
            houses.forEach(i -> i.setUser(this));
        }
        this.houses = houses;
    }
}
