package org.hussard.builder.simple;

import java.time.LocalDate;

public class Personne {
    private final String nom;
    private final String prenom;
    private final LocalDate age;

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public LocalDate getAge() {
        return age;
    }

    public Personne(PersonneBuilder builder) {
        this.nom = builder.nom;
        this.prenom = builder.prenom;
        this.age = builder.age;
    }

    public static final class PersonneBuilder {
        private String nom;
        private String prenom;
        private LocalDate age;

        private PersonneBuilder() {
        }

        public static PersonneBuilder aPersonne() {
            return new PersonneBuilder();
        }

        public PersonneBuilder nom(String nom) {
            this.nom = nom;
            return this;
        }

        public PersonneBuilder prenom(String prenom) {
            this.prenom = prenom;
            return this;
        }

        public PersonneBuilder age(LocalDate age) {
            this.age = age;
            return this;
        }

        public Personne build() {
            return new Personne(this);
        }
    }
}
