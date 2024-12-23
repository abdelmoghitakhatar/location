package com.app.location.domain;

import com.app.location.domain.enumeration.City;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "house")
public class HouseDomain  implements Serializable {

     @Serial
     private static final long serialVersionUID = 4266317452836949637L;

     @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;

     @NotNull
     @Column(nullable = false)
     private LocalDate createdDate;

     @NotNull
     @Column(unique = true, nullable = false)
     private String localisation;

     @NotNull
     @Enumerated(EnumType.STRING)
     @Column(nullable = false)
     private City city;

     @NotNull
     @Column(nullable = false)
     private String address;

     @NotNull
     @Min(0)
     @Column(nullable = false)
     private double price;

     @NotNull
     @Size(min = 50, max = 2000)
     @Column(nullable = false)
     private String description;

     @NotNull
     @Column(nullable = false)
     private boolean available = true;

     @ManyToOne
     private UserDomain user;

     @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "house", fetch = FetchType.LAZY)
     private Set<DocumentDomain> documents = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public UserDomain getUser() {
        return user;
    }

    public void setUser(UserDomain user) {
        this.user = user;
    }

    public Set<DocumentDomain> getDocuments() {
        return documents;
    }

    public void setDocuments(Set<DocumentDomain> documents) {
        if(documents != null){
            documents.forEach(i -> i.setHouse(this));
        }
        this.documents = documents;
    }
}
