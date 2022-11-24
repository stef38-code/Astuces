package org.hussard.builder.fluent;

import java.time.LocalDate;

public class Personne {
    private final String nom;
    private final String prenom;
    private final LocalDate age;

    // Le contructeur ne présente pas de mot clef d'accéssibilité
    // tout simplement pour ne pas donner la possibilité de créer une nouvelle
    // instance sans passer par le builder
    Personne(String nom, String prenom, LocalDate age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }
    //Appel au builder
    public static PersonneFluent aNew() {
        return new PersonneCreate();
    }
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public LocalDate getAge() {
        return age;
    }
}
