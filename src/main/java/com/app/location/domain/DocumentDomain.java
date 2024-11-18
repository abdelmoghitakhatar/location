package com.app.location.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "document")
public class DocumentDomain implements Serializable {

    @Serial
    private static final long serialVersionUID = 8050998889605628688L;

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    @NotNull
    @Column(nullable = false)
    private String image;

    @ManyToOne
    private HouseDomain house;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public HouseDomain getHouse() {
        return house;
    }

    public void setHouse(HouseDomain house) {
        this.house = house;
    }
}
