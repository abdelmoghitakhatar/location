package com.app.location.domain;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "facture")
public class FactureDomain implements Serializable {

    @Serial
    private static final long serialVersionUID = -1634464865272280153L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
