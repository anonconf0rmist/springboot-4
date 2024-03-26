package com.rest.api.SpringMagic.Model;

import javax.persistence.*;

@Entity
@Table(name = "properties")
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private double price;

    // Other fields such as location, amenities, etc.

    // Constructors, getters, and setters
}
