package com.nimblegeek.application.entities;

import jakarta.persistence.*;

@Entity
public class Club {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private final String name;
    private final String website;

    public Club() {
        this.name = "";
        this.website = "";
    }

    public Club(String name, String website) {
        this.name = name;
        this.website = website;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getWebsite() {
        return website;
    }

    @Override
    public String toString() {
        return "Club{" + "id=" + id + ", name=" + name + ", email=" + website + '}';
    }
}